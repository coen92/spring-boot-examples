package com.coen92.ddd.structures.infrastructure.database;

import java.util.UUID;


abstract class BaseEntity {
    protected final UUID id;

    protected BaseEntity() {
        this.id = UUID.randomUUID();
    }
}
