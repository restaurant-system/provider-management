package com.restaurant.providers.services;

import com.restaurant.providers.data.entities.ProviderTypeEntity;
import com.restaurant.providers.data.repositories.ProviderTypeRepository;
import com.restaurant.providers.dto.ProviderTypeDTO;
import com.restaurant.providers.mappers.ProviderTypeMapper;

public class ProviderTypeService {

    private final ProviderTypeRepository repository;
    private final ProviderTypeMapper mapper;

    public ProviderTypeService(ProviderTypeRepository repository, ProviderTypeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProviderTypeDTO create(ProviderTypeDTO providerTypeDto) {
        final ProviderTypeEntity providerTypeEntity = repository.save(mapper.toEntity(providerTypeDto));
        return mapper.toDTO(providerTypeEntity);
    }
}
