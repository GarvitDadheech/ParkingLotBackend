package dev.garvit.parkinglot.repositories;

import dev.garvit.parkinglot.models.Gate;
import lombok.Getter;
import lombok.Setter;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
@Setter
@Getter

public class GateRepo {
    private Map<Long,Gate> gates = new HashMap<>();

    public Optional<Gate> findById(Long gateId) {
        return Optional.ofNullable(gates.get(gateId));
    }
}
