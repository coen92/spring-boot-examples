package com.coen92.ddd.structures.infrastructure.database;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class RewardDateRangeEntity {
    private LocalDate startDate;
    private LocalDate endDate;
}
