package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Promedio implements ValueObject<Double> {

    private final double value;

    public Promedio(double value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public void validaciones() {
        if(this.value < 0) {
            throw new IllegalArgumentException("El promedio debe ser mayor a 0");
        }
        if(this.value > 5) {
            throw new IllegalArgumentException("El promedio no puede ser mayor a 5");
        }
    }

    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Promedio)) return false;
        Promedio promedio = (Promedio) o;
        return Double.compare(promedio.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
