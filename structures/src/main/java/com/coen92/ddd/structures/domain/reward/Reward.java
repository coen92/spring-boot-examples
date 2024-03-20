package com.coen92.ddd.structures.domain.reward;


import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@EqualsAndHashCode
public class Reward {
    private final String name;
    private final Integer cost;
    private final RewardDateRange dateRange;

    public Reward(String name, Integer cost, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.cost = cost;
        this.dateRange = new RewardDateRange(startDate, endDate);
    }
}
