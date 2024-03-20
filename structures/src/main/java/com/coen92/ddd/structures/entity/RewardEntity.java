package com.coen92.ddd.structures.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
public class RewardEntity extends BaseEntity {
    private String name;
    private Integer cost;
    @Embedded
    private RewardDateRangeEntity dateRange;

    public RewardEntity(String name, Integer cost) {
        super();
        this.name = name;
        this.cost = cost;
    }

    @Id
    public UUID getId() {
        return this.id;
    }
}
