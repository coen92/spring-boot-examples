package com.coen92.basic.datastructures.queue;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Queue;

@Slf4j
@RequiredArgsConstructor
public class QueueDataStructure<T> {
    // interface that extends Collection<T> interface
    private final Queue<T> queue;

    final void queueItem(T item) {
        queue.offer(item);
    }

    T getFirstItem() {
        return queue.poll(); // OR queue.remove();
    }

    T checkFirstItem() {
        return queue.peek(); // OR queue.element();
    }

    boolean hasItems() {
        return !queue.isEmpty();
    }
}
