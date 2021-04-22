package com.restaurant.providers.dto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test class for the provider type data transfer object.
 */
@JsonTest
public class ProviderTypeDTOTest {

    @Autowired
    private JacksonTester<ProviderTypeDTO> jacksonTester;

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

    @Test
    public void serializesToJson() throws IOException {
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO(1, "SUPERMARKET", "Supermarket");
        assertThat(this.jacksonTester.write(providerTypeDto)).isEqualToJson("/providerTypeDto.json");
    }

    @Test
    public void deserializesFromJson() throws IOException {
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO(1, "SUPERMARKET", "Supermarket");
        assertEquals(providerTypeDto, this.jacksonTester.readObject("/providerTypeDto.json"));
    }

    @Test
    public void serializesToJsonWithoutId() throws IOException {
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO("SUPERMARKET", "Supermarket");
        System.out.println(this.jacksonTester.write(providerTypeDto));
        assertThat(this.jacksonTester.write(providerTypeDto)).isEqualToJson("/providerTypeDtoWithoutId.json");
    }

    @Test
    public void deserializesFromJsonWithoutId() throws IOException {
        ProviderTypeDTO providerTypeDto = new ProviderTypeDTO("SUPERMARKET", "Supermarket");
        assertEquals(providerTypeDto, this.jacksonTester.readObject("/providerTypeDtoWithoutId.json"));
    }
}