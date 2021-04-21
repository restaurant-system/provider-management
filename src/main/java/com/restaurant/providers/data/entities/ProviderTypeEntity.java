package com.restaurant.providers.data.entities;

import java.io.Serializable;
import java.util.Objects;

public class ProviderTypeEntity implements Serializable {
    private static final long serialVersionUID = 4396550301125213198L;

    private final Integer id;
    private final String type;
    private final String friendlyName;

    public ProviderTypeEntity(final Integer id, final String type, final String friendlyName) {
        this.id = id;
        this.type = type;
        this.friendlyName = friendlyName;
    }

    public ProviderTypeEntity(final String type, final String friendlyName) {
        this(null, type, friendlyName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderTypeEntity that = (ProviderTypeEntity) o;
        return Objects.equals(id, that.id) && type.equals(that.type) && friendlyName.equals(that.friendlyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, friendlyName);
    }

    @Override
    public String toString() {
        return "ProviderTypeEntity { " +
                "id = " + id +
                ", type = \"" + type + "\"" +
                ", friendlyName = \"" + friendlyName + "\"" +
                " }";
    }
}
