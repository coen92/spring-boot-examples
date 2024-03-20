package com.coen92.ddd.aggregate.events;

import com.coen92.ddd.aggregate.domain.Document;

public class DocumentArchived extends DomainEvent {
    private static final Integer EVENT_VERSION = 1;

    public DocumentArchived(Document.DocumentId id) {
        super(id, EVENT_VERSION);
    }
}
