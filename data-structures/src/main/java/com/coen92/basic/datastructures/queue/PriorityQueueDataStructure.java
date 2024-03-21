package com.coen92.basic.datastructures.queue;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.PriorityQueue;

@Slf4j
@Getter
public class PriorityQueueDataStructure<T> {
    private final PriorityQueue<T> priorityQueue;

    public PriorityQueueDataStructure(Comparator<T> comparator) {
        this.priorityQueue = new PriorityQueue<>(comparator);
    }

    final void queueItem(T item) {
        priorityQueue.offer(item);
    }

    final PriorityQueue<T> getReversed() {
        return new PriorityQueue<>(priorityQueue.comparator().reversed());
    }
}
