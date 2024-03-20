package com.coen92.ddd.aggregate.events;

import org.springframework.stereotype.Component;

@Component
public interface DomainEventsListener {
    void handle(DomainEvent event);
    boolean supports(DomainEvent event);
}
