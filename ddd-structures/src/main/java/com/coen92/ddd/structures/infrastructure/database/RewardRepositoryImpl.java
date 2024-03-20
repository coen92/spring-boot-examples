package com.coen92.ddd.structures.infrastructure.database;

import com.coen92.ddd.structures.domain.reward.Reward;
import com.coen92.ddd.structures.domain.reward.RewardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RewardRepositoryImpl implements RewardRepository {
    private final RewardJpaRepository repository;
    private final RewardMapper mapper;

    @Override
    public void save(Reward reward) {
        var entity = mapper.map(reward);
        repository.save(entity);
    }

    @Override
    public void update(Reward reward) {
        // implementation
    }

    @Override
    public void remove(Reward reward) {
        // implementation
    }
}
