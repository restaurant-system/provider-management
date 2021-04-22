package com.restaurant.providers.mappers;

import org.junit.jupiter.api.Test;

import com.restaurant.providers.data.entities.ProviderTypeEntity;
import com.restaurant.providers.dto.ProviderTypeDTO;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProviderTypeMapperTest {

    @Test
    public void checkMapToEntity() {
        ProviderTypeMapper providerTypeMapper = new ProviderTypeMapper();
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO(1, "SUPERMARKET", "Supermarket");
        ProviderTypeEntity expectedEntity = new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket");
        assertEquals(expectedEntity, providerTypeMapper.toEntity(providerTypeDto));
    }

    @Test
    public void checkMapToDTO() {
        ProviderTypeMapper providerTypeMapper = new ProviderTypeMapper();
        ProviderTypeEntity providerTypeEntity = new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket");
        ProviderTypeDTO expectedDto = new ProviderTypeDTO(1, "SUPERMARKET", "Supermarket");
        assertEquals(expectedDto, providerTypeMapper.toDTO(providerTypeEntity));
    }
}
