package com.coen92.ddd.structures.infrastructure.database;

@FunctionalInterface
public interface EntityMapper<D, E> {
    E map(D object);
}
