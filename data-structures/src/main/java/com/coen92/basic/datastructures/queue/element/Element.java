package com.coen92.basic.datastructures.queue.element;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Element {
    /***
     * Lower value means higher priority of this element
     * */
    private final Integer priority;
}
