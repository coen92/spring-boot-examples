package com.coen92.ddd.aggregate.command;

import com.coen92.ddd.aggregate.events.DocumentArchived;

public class ArchiveDocumentCommand extends Command {
    public ArchiveDocumentCommand(DocumentArchived event) {
        super(event.getAggregateId());
    }
}
