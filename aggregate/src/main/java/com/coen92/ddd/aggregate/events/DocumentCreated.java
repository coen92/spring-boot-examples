package com.coen92.ddd.aggregate.events;

import static com.coen92.ddd.aggregate.domain.Document.DocumentId;

public class DocumentCreated extends DomainEvent {
    private static final Integer version = 1;

    public DocumentCreated(DocumentId id) {
        super(id, version);
    }
}
