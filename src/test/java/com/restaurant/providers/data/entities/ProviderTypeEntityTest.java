package com.restaurant.providers.data.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test class for {@link ProviderTypeEntity}.
 */
public class ProviderTypeEntityTest {

    @Test
    public void checkEqualsAndHashCodeConsistency() {
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

    @Test
    public void checkToStringConsistency() {
        ProviderTypeEntity providerTypeEntity = new ProviderTypeEntity("SUPERMARKET", "Supermarket");
        String expected = "ProviderTypeEntity { id = null, type = \"SUPERMARKET\", friendlyName = \"Supermarket\" }";
        assertEquals(expected, providerTypeEntity.toString());
    }

}