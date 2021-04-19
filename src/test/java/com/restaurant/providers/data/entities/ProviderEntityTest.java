package com.restaurant.providers.data.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test class for the provider JPA entity.
 */
public class ProviderEntityTest {

    @Test
    public void checkEqualsAndHashCodeConsistency() {
        ProviderEntity providerEntity = new ProviderEntity(1,"Walmart", ProviderType.SUPER_MARKET);
        ProviderEntity providerEntityCopy = new ProviderEntity(1, "Walmart", ProviderType.SUPER_MARKET);
        assertEquals(providerEntity, providerEntityCopy);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctId() {
        ProviderEntity providerEntity = new ProviderEntity(1, "Walmart", ProviderType.SUPER_MARKET);
        ProviderEntity otherProviderEntity = new ProviderEntity(null, "Walmart", ProviderType.SUPER_MARKET);
        assertNotEquals(providerEntity, otherProviderEntity);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctName() {
        ProviderEntity providerEntity = new ProviderEntity(1, "Walmart", ProviderType.SUPER_MARKET);
        ProviderEntity otherProviderEntity = new ProviderEntity(1, "Chedraui", ProviderType.SUPER_MARKET);
        assertNotEquals(providerEntity, otherProviderEntity);
    }

    @Test
    public void checkEqualsAndHashCodeDistinctType() {
        ProviderEntity providerEntity = new ProviderEntity(1, "Walmart", ProviderType.SUPER_MARKET);
        ProviderEntity otherProviderEntity = new ProviderEntity(1, "Walmart", ProviderType.BUTCHER_SHOP);
        assertNotEquals(providerEntity, otherProviderEntity);
    }

    @Test
    public void checkToStringConsistency() {
        ProviderEntity providerEntity = new ProviderEntity(1,"Walmart", ProviderType.SUPER_MARKET);
        String expected = "ProviderEntity { id = 1, name = \"Walmart\", type = SUPER_MARKET }";
        assertEquals(expected, providerEntity.toString());
    }
}
