package co.com.softka.TallerDDD.clase.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Duracion implements ValueObject<Integer> {

    private final int value;

    public Duracion(int value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public void validaciones() {
        if (this.value < 0){
            throw new IllegalArgumentException("Duracion no valida");
        }
    }

    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Duracion)) return false;
        Duracion duracion = (Duracion) o;
        return value == duracion.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
