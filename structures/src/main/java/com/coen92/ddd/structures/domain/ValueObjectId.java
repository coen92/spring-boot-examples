package com.coen92.ddd.structures.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class ValueObjectId<T> {
    protected final T value;

    public ValueObjectId(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s{value=%s}", this.getClass().getSimpleName(), value);
    }
}
