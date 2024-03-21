package com.coen92.basic.datastructures.list;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

@Slf4j
@RequiredArgsConstructor
public class LinkedListDataStructure<T> {
    private final LinkedList<T> list; // contains also methods of Queue or Stack data structures

    void appendItem(T item) {
        log.info("Appending new item to the end of LinkedList.");
        list.add(item);
    }

    void addHeadItem(T item) {
        log.info("Adding new item to the beginning of LinkedList.");
        list.addFirst(item);
    }

    // equivalent to add()
    void addTailItem(T item) {
        log.info("Appending new item to the end of LinkedList.");
        list.addLast(item);
    }

    void addItem(int index, T item) {
        log.info("Adding new item to the index {} of LinkedList.", index);
        list.add(index, item);
    }

    T getFirstItem() {
        log.info("Returning first item of the LinkedList.");
        return list.getFirst();
    }

    T getLastItem() {
        log.info("Returning last item of the LinkedList.");
        return list.getLast();
    }

    T getItem(T item) {
        int index = list.lastIndexOf(item);
        log.info("Returning item of index {} from the LinkedList.", index);
        return list.get(index);
    }

    T getByIndex(int index) {
        log.info("Returning item of index {} from the LinkedList.", index);
        return list.get(index);
    }

}
