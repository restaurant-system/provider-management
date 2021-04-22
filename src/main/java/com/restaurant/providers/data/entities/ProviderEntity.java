package com.restaurant.providers.data.entities;

import java.io.Serializable;
import java.util.Objects;

public class ProviderEntity implements Serializable  {
    private static final long serialVersionUID = 7115077407837994358L;

    private final Integer id;
    private final String name;
    private final ProviderTypeEntity type;

    public ProviderEntity(Integer id, String name, ProviderTypeEntity type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProviderEntity that = (ProviderEntity) o;
        return Objects.equals(id, that.id) && name.equals(that.name) && type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }

    @Override
    public String toString() {
        return "ProviderEntity { " +
                "id = " + id +
                ", name = \"" + name + "\"" +
                ", type = " + type.toString() +
                " }";
    }
}
