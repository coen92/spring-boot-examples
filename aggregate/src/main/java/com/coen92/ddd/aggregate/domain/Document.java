package com.coen92.ddd.aggregate.domain;

import com.coen92.ddd.aggregate.events.DocumentArchived;
import com.coen92.ddd.aggregate.events.DocumentCreated;
import com.coen92.ddd.aggregate.events.DomainEvent.AggregateId;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.UUID;

@Getter
@EqualsAndHashCode(callSuper = false)
public final class Document extends AggregateRoot {
    private final DocumentId id;
    private final String content;
    private final EditorId editorId;
    private Status status;

    enum Status { Archived, Blocked, Hidden, Issued, Accepted, Active }

    private Document(DocumentId id, String content, EditorId editorId) {
        this.id = id;
        this.content = content;
        this.editorId = editorId;
        this.status = Status.Active;
    }

    public static Document create(DocumentId id, String content, EditorId editorId) {
        var document = new Document(id, content, editorId);
        document.raiseEvent(new DocumentCreated(id));

        return document;
    }

    public void archive(DocumentId id) {
        if (!this.isArchived()) {
            this.status = Status.Archived;
            this.raiseEvent(new DocumentArchived(id));
        }
    }

    private boolean isArchived() {
        return Status.Archived.equals(this.status);
    }

    @Getter
    public static final class DocumentId extends AggregateId {
        public DocumentId(UUID id) {
            super(id);
        }
    }

    @Getter
    public static final class EditorId extends AggregateId {
        private final String email;

        private EditorId(UUID id, String email) {
            super(id);
            this.email = email;
        }
    }
}
