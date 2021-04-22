package com.restaurant.providers.data.repositories;

import com.restaurant.providers.data.entities.ProviderTypeEntity;
import org.springframework.data.repository.Repository;

public interface ProviderTypeRepository extends Repository<ProviderTypeEntity, Integer> {
    ProviderTypeEntity save(ProviderTypeEntity entity);
}
