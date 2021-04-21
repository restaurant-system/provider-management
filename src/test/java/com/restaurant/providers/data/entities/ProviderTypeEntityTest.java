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

    @Test
    public void checkEqualsAndHashCodeDistinctId() {
        ProviderTypeEntity providerTypeEntity = new ProviderTypeEntity("SUPERMARKET", "Supermarket");
        ProviderTypeEntity otherProviderTypeEntity = new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket");
        assertNotEquals(providerTypeEntity, otherProviderTypeEntity);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctType() {
        ProviderTypeEntity providerTypeEntity = new ProviderTypeEntity("SUPERMARKET", "Supermarket");
        ProviderTypeEntity otherProviderTypeEntity = new ProviderTypeEntity("BUTCHER_SHOP", "Butcher Shop");
        assertNotEquals(providerTypeEntity, otherProviderTypeEntity);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctFriendlyName() {
        ProviderTypeEntity providerTypeEntity = new ProviderTypeEntity("SUPERMARKET", "Supermarket");
        ProviderTypeEntity otherProviderTypeEntity = new ProviderTypeEntity("SUPERMARKET", "Super market!!!");
        assertNotEquals(providerTypeEntity, otherProviderTypeEntity);
    }
}