package com.coen92.ddd.aggregate.events;

public interface DomainEventsDispatcher {
    void dispatch(DomainEvent... domainEvents);
}
