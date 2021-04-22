package com.restaurant.providers.dto;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProviderTypeDTO implements Serializable {
    private static final long serialVersionUID = 4058362625395929398L;

    private final Integer id;
    private final String type;
    private final String friendlyName;

    @JsonCreator
    public ProviderTypeDTO(@JsonProperty("id") final Integer id, @JsonProperty("type") final String type,
                           @JsonProperty("friendlyName") final String friendlyName) {
        this.id = id;
        this.type = type;
        this.friendlyName = friendlyName;
    }

    public ProviderTypeDTO(final String type, final String friendlyName) {
        this(null, type, friendlyName);
    }

    @JsonProperty("id")
    @JsonInclude(Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("friendlyName")
    public String getFriendlyName() {
        return friendlyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderTypeDTO that = (ProviderTypeDTO) o;
        return Objects.equals(id, that.id) && type.equals(that.type) && friendlyName.equals(that.friendlyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, friendlyName);
    }

    @Override
    public String toString() {
        return "ProviderTypeDTO { " +
                "id = " + id +
                ", type = \"" + type + "\"" +
                ", friendlyName = \"" + friendlyName + "\"" +
                " }";
    }
}
