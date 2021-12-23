package co.com.softka.TallerDDD.profesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Calificado implements ValueObject<Boolean> {
    private final Boolean value;

    public Calificado(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    public Boolean value() {
        return value;
    }
}
