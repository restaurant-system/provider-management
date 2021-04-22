package com.restaurant.providers.dto;

import java.io.Serializable;
import java.util.Objects;

public class ProviderTypeDTO implements Serializable {
    private static final long serialVersionUID = 4058362625395929398L;

    private final Integer id;
    private final String type;
    private final String friendlyName;

    public ProviderTypeDTO(final Integer id, final String type, final String friendlyName) {
        this.id = id;
        this.type = type;
        this.friendlyName = friendlyName;
    }

    public ProviderTypeDTO(final String type, final String friendlyName) {
        this(null, type, friendlyName);
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
