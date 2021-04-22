package com.restaurant.providers.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test class for the provider type data transfer object.
 */
public class ProviderTypeDTOTest {

    @Test
    public void checkEqualsAndHashCodeConsistency() {
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO(1, "SUPERMARKET", "Supermarket");
        ProviderTypeDTO providerTypeDtoCopy = new ProviderTypeDTO(1, "SUPERMARKET", "Supermarket");
        assertEquals(providerTypeDto, providerTypeDtoCopy);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctId() {
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO("SUPERMARKET", "Supermarket");
        ProviderTypeDTO otherProviderTypeDto = new ProviderTypeDTO(1, "SUPERMARKET", "Supermarket");
        assertNotEquals(providerTypeDto, otherProviderTypeDto);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctType() {
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO("SUPERMARKET", "Supermarket");
        ProviderTypeDTO otherProviderTypeDto = new ProviderTypeDTO("BUTCHER_SHOP", "Butcher Shop");
        assertNotEquals(providerTypeDto, otherProviderTypeDto);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctFriendlyName() {
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO("SUPERMARKET", "Supermarket");
        ProviderTypeDTO otherProviderTypeDto = new ProviderTypeDTO("SUPERMARKET", "Super market!!!");
        assertNotEquals(providerTypeDto, otherProviderTypeDto);
    }

    @Test
    public void checkToStringConsistency() {
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO("SUPERMARKET", "Supermarket");
        String expected = "ProviderTypeDTO { id = null, type = \"SUPERMARKET\", friendlyName = \"Supermarket\" }";
        assertEquals(expected, providerTypeDto.toString());
    }
}