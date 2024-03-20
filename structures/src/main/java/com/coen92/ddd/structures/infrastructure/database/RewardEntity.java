package com.coen92.ddd.structures.infrastructure.database;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "rewards")
public class RewardEntity extends BaseEntity {
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "cost")
    private Integer cost;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "startDate", column = @Column(name = "started_on")),
            @AttributeOverride(name = "endDate", column = @Column(name = "ends_on"))
    })
    private RewardDateRangeEntity dateRange;
    public RewardEntity(String name, Integer cost, RewardDateRangeEntity dateRange) {
        super();
        this.name = name;
        this.cost = cost;
        this.dateRange = dateRange;
    }

    @Id
    public UUID getId() {
        return this.id;
    }
}
