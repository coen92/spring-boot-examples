package com.coen92.ddd.aggregate.events;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Set;

@Component
@RequiredArgsConstructor
public final class DomainEventsDispatcherImpl implements DomainEventsDispatcher {
    private final Set<DomainEventsListener> listeners;

    @Override
    public void dispatch(DomainEvent... domainEvents) {
        Arrays.stream(domainEvents)
                .sequential()
                .forEach(event -> listeners.stream()
                        .filter(l -> l.supports(event))
                        .findAny()
                        .ifPresent(l -> l.handle(event)));
    }
}
