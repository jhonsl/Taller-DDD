package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Calificacion implements ValueObject<Double>
{
    private final Double value;

    public Calificacion(Double value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public void validaciones(){
        if(this.value.isNaN()){
            throw new IllegalArgumentException("La calificacion no puede ser asignada");
        }

        if(this.value < 0 || this.value > 5){
            throw new IllegalArgumentException("La nota debe ser mayor a 0 y menor a 5");
        }
    }

    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calificacion)) return false;
        Calificacion that = (Calificacion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
