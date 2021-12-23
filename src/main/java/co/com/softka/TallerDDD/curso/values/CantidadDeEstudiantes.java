package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadDeEstudiantes implements ValueObject<Integer> {

    private final int value;

    public CantidadDeEstudiantes(int value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public Integer value() {
        return value;
    }

    public void validaciones() {
        if(this.value <= 0) {
            throw new IllegalArgumentException("Debe haber almenos un estudiante por clase");
        }

        if(this.value > 30) {
            throw new IllegalArgumentException("Puede haber maximo 30 estudiantes por salon");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CantidadDeEstudiantes)) return false;
        CantidadDeEstudiantes that = (CantidadDeEstudiantes) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
