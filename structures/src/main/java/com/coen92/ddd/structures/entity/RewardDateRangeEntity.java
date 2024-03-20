package com.coen92.ddd.structures.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class RewardDateRangeEntity {
    private LocalDate startDate;
    private LocalDate endDate;
}
