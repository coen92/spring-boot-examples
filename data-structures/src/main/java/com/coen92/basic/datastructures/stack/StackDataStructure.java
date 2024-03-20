package com.coen92.basic.datastructures.stack;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;
import java.util.Stack;

@Slf4j
@RequiredArgsConstructor
public class StackDataStructure<T> {
    private final Stack<T> stack;

    @SafeVarargs
    final void stackItems(T... items) {
        for (var item : items) {
            log.info("Adding item {} to the stack.", item.toString());
            stack.push(item);
        }
    }

    boolean hasItems() {
        return !stack.empty();
    }

    boolean hasItem(T item) {
        return stack.search(item) != -1;
    }

    Optional<T> getLastItem() {
        if (hasItems())
            return Optional.of(stack.pop());

        log.warn("Stack of items is empty!");
        return Optional.empty();
    }

    Optional<T> checkLastItem() {
        if (hasItems())
            return Optional.of(stack.peek());

        log.warn("Stack of items is empty!");
        return Optional.empty();
    }
}
