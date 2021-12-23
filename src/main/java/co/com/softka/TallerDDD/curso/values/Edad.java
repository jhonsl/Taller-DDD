package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Edad implements ValueObject<Integer> {

    private final int value;

    public Edad(int value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public Integer value() {
        return value;
    }

    public void validaciones() {
        if(this.value < 6) {
            throw new IllegalArgumentException("El estudiante debe tener almenos 6 años");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edad)) return false;
        Edad edad = (Edad) o;
        return value == edad.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
