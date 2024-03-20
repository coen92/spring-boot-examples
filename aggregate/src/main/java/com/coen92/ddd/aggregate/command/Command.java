package com.coen92.ddd.aggregate.command;

import com.coen92.ddd.aggregate.events.DomainEvent.AggregateId;
import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class Command {
    private final UUID commandId;

    public Command(AggregateId targetId) {
        this.commandId = targetId.getId();
    }
}
