package com.coen92.ddd.structures.domain.user;

import com.coen92.ddd.structures.domain.reward.Reward;

import java.util.List;

public record User(UserId id, String name, List<Reward> rewards) {
}
