package com.restaurant.providers.data.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test class for the provider JPA entity.
 */
public class ProviderEntityTest {

    @Test
    public void checkEqualsAndHashCodeConsistency() {
        ProviderEntity providerEntity = new ProviderEntity(1, "Walmart",
                new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket"));
        ProviderEntity providerEntityCopy = new ProviderEntity(1, "Walmart",
                new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket"));
        assertEquals(providerEntity, providerEntityCopy);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctId() {
        ProviderEntity providerEntity = new ProviderEntity(1, "Walmart",
                new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket"));
        ProviderEntity otherProviderEntity = new ProviderEntity(null, "Walmart",
                new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket"));
        assertNotEquals(providerEntity, otherProviderEntity);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctName() {
        ProviderEntity providerEntity = new ProviderEntity(1, "Walmart",
                new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket"));
        ProviderEntity otherProviderEntity = new ProviderEntity(1, "Chedraui",
                new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket"));
        assertNotEquals(providerEntity, otherProviderEntity);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctType() {
        ProviderEntity providerEntity = new ProviderEntity(1, "La Casa del Tío Juan",
                new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket"));
        ProviderEntity otherProviderEntity = new ProviderEntity(1, "La Casa del Tío Juan",
                new ProviderTypeEntity(2, "BUTCHER_SHOP", "Butcher Shop"));
        assertNotEquals(providerEntity, otherProviderEntity);
    }

    @Test
    public void checkToStringConsistency() {
        ProviderEntity providerEntity = new ProviderEntity(1, "Walmart",
                new ProviderTypeEntity(1, "SUPERMARKET", "Supermarket"));
        String expected = "ProviderEntity { id = 1, name = \"Walmart\", type = " +
                "ProviderTypeEntity { id = 1, type = \"SUPERMARKET\", friendlyName = \"Supermarket\" }" +
                " }";
        assertEquals(expected, providerEntity.toString());
    }
}
