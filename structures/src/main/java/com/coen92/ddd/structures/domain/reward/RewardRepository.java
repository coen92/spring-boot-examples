package com.coen92.ddd.structures.domain.reward;

public interface RewardRepository {
    void save(Reward reward);
    void update(Reward reward);
    void remove(Reward reward);

}
