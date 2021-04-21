package com.restaurant.providers.data.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test class for {@link ProviderTypeEntity}.
 */
public class ProviderTypeEntityTest {

    @Test
    public void checkEqualsAndHashCodeConsistency(){
        ProviderTypeEntity providerTypeEntity = new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket");
        ProviderTypeEntity providerTypeEntityCopy = new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket");
        assertEquals(providerTypeEntity, providerTypeEntityCopy);
    }
}