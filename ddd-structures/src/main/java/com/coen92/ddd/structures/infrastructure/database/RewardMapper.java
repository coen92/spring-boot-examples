package com.coen92.ddd.structures.infrastructure.database;

import com.coen92.ddd.structures.domain.reward.Reward;
import com.coen92.ddd.structures.domain.reward.RewardDateRange;
import org.springframework.stereotype.Component;

@Component
public class RewardMapper implements EntityMapper<Reward, RewardEntity> {
    @Override
    public RewardEntity map(Reward reward) {
        return new RewardEntity(
                reward.getName(),
                reward.getCost(),
                map(reward.getDateRange())
        );
    }

    private RewardDateRangeEntity map(RewardDateRange dateRange) {
        return new RewardDateRangeEntity(dateRange.getStartDate(), dateRange.getEndDate());
    }
}
