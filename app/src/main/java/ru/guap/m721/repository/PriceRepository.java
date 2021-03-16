package ru.guap.m721.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.guap.m721.model.data.Price;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PriceRepository extends JpaRepository<Price, UUID> {
    Optional<Price> findTopByCatalogueIdOrderByVersionDesc(UUID catalogueId);
}
