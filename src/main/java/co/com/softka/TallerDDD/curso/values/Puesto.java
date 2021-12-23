package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Puesto implements ValueObject<Integer> {

    private final int value;

    public Puesto(int value) {
        this.value = Objects.requireNonNull(value);
    }

    public void validaciones() {
        if (this.value < 1) {
            throw new IllegalArgumentException("El mayor puesto es 1");
        }
        if( this.value > 30) {
            throw new IllegalArgumentException("El maximo puesto es 30");
        }
    }

    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Puesto)) return false;
        Puesto puesto = (Puesto) o;
        return value == puesto.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
