package com.coen92.ddd.aggregate.command;

import com.coen92.ddd.aggregate.events.DomainEvent;
import com.coen92.ddd.aggregate.events.DomainEventsDispatcher;
import com.coen92.ddd.aggregate.infrastructure.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static com.coen92.ddd.aggregate.domain.Document.DocumentId;

@Component
@RequiredArgsConstructor
public final class ArchiveDocumentHandler implements CommandHandler<ArchiveDocumentCommand> {
    private final DocumentRepository repository;
    private final DomainEventsDispatcher dispatcher;

    @Override
    public void handle(ArchiveDocumentCommand command) {
        DocumentId id = new DocumentId(command.getCommandId());
        var document = repository.getById(id);
        document.archive(id);

        repository.save(document);
        dispatcher.dispatch(document.getEvents().toArray(new DomainEvent[0]));
    }
}
