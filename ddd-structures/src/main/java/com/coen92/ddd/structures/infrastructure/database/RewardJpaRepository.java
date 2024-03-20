package com.coen92.ddd.structures.infrastructure.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface RewardJpaRepository extends CrudRepository<RewardEntity, UUID> {
}
