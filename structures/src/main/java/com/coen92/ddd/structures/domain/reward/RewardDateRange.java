package com.coen92.ddd.structures.domain.reward;


import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@EqualsAndHashCode
public final class RewardDateRange {
    private final LocalDate startDate;
    private final LocalDate endDate;

    public RewardDateRange(LocalDate startDate, LocalDate endDate) {
        if (startDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Start date must be from the future");
        }
        if (endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date must be after start date");
        }
        this.startDate = startDate;
        this.endDate = endDate;
    }

    boolean isAvailableAt(LocalDate date) {
        return date.isAfter(this.startDate) && date.isBefore(this.endDate);
    }

    RewardDateRange extendDate(LocalDate extendedDate) {
        if (extendedDate.isBefore(this.endDate)) {
            throw new IllegalArgumentException("New end date must be after old end date");
        }
        return new RewardDateRange(startDate, extendedDate);
    }
}
