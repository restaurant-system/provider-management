package com.restaurant.providers.services;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.restaurant.providers.data.entities.ProviderTypeEntity;
import com.restaurant.providers.data.repositories.ProviderTypeRepository;
import com.restaurant.providers.dto.ProviderTypeDTO;
import com.restaurant.providers.mappers.ProviderTypeMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProviderTypeServiceTest {

    @Test
    public void successProviderTypeCreation() {
        ProviderTypeRepository providerTypeRepository = Mockito.mock(ProviderTypeRepository.class);
        Mockito.when(providerTypeRepository.save(new ProviderTypeEntity("SUPERMARKET", "Supermarket")))
                .thenReturn(new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket"));
        ProviderTypeService providerService = new ProviderTypeService(providerTypeRepository, new ProviderTypeMapper());
        ProviderTypeDTO expected = new ProviderTypeDTO(1, "SUPERMARKET", "Supermarket");
        assertEquals(expected, providerService.create(new ProviderTypeDTO("SUPERMARKET", "Supermarket")));
        Mockito.verify(providerTypeRepository).save(new ProviderTypeEntity("SUPERMARKET", "Supermarket"));
    }
}
