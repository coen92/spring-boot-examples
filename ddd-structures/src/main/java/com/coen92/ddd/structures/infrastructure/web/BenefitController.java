package com.coen92.ddd.structures.infrastructure.web;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/rewards")
public class BenefitController {

    @PostMapping("/{rewardId}/grant")
    void grantReward(@PathVariable String rewardId, @RequestBody UserDto dto) {
        // implementation
    }

    private record UserDto(UUID userId) {
    }
}
