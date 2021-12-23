package co.com.softka.TallerDDD.clase.values;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calificado)) return false;
        Calificado that = (Calificado) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
