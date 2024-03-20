package com.coen92.ddd.structures.entity;

import java.util.UUID;


abstract class BaseEntity {
    protected final UUID id;

    protected BaseEntity() {
        this.id = UUID.randomUUID();
    }
}
