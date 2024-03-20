package com.coen92.ddd.structures.domain.user;

import com.coen92.ddd.structures.domain.ValueObjectId;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
public class UserId extends ValueObjectId<UUID> {
    private UserId(UUID userId) {
        super(userId);
    }

    public static UserId of(UUID id) {
        return new UserId(id);
    }

    public static UserId of(String id) {
        return new UserId(UUID.fromString(id));
    }
}
