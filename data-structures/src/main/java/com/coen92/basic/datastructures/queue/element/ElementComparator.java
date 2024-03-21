package com.coen92.basic.datastructures.queue.element;

import java.util.Comparator;

public class ElementComparator implements Comparator<Element> {
    @Override
    public int compare(Element e1, Element e2) {
        return e1.getPriority().compareTo(e2.getPriority());
    }
}
