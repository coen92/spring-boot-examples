package com.coen92.ddd.aggregate.domain;

import com.coen92.ddd.aggregate.events.DomainEvent;
import lombok.Getter;

import java.util.Set;

@Getter
abstract class AggregateRoot {

    private Set<DomainEvent> events;

    public final Set<DomainEvent> pullEvents() {
        var events = this.events;
        this.events.clear();

        return events;
    }

    protected final void raiseEvent(DomainEvent event) {
        this.events.add(event);
    }
}
