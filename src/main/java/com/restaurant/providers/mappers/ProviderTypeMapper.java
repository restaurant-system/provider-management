package com.restaurant.providers.mappers;

import com.restaurant.providers.data.entities.ProviderTypeEntity;
import com.restaurant.providers.dto.ProviderTypeDTO;

public class ProviderTypeMapper {
    public ProviderTypeEntity toEntity(ProviderTypeDTO dto) {
        return new ProviderTypeEntity(dto.getId(), dto.getType(), dto.getFriendlyName());
    }

    public ProviderTypeDTO toDTO(ProviderTypeEntity entity) {
        return new ProviderTypeDTO(entity.getId(), entity.getType(), entity.getFriendlyName());
    }
}
