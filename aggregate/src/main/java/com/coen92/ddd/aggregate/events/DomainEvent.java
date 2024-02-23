package com.coen92.ddd.aggregate.events;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@Getter
@EqualsAndHashCode
public abstract class DomainEvent {

    protected AggregateId aggregateId;
    protected Integer version;
    protected Instant occurredOn;

    public DomainEvent(AggregateId aggregateId, Integer version) {
        this.aggregateId = aggregateId;
        this.version = version;
        this.occurredOn = Instant.now();
    }


    @Getter
    public static class AggregateId {
        private final UUID id;

        public AggregateId(UUID id) {
            this.id = id;
        }
    }
}
