package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Investigacion implements ValueObject<String> {

    private final String value;

    public Investigacion(String value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public void validaciones() {
        if(this.value.length() < 20) {
            throw new IllegalArgumentException("La investigacion debe tener almenos 20 caracteres");
        }

        if(this.value.length() > 200) {
            throw new IllegalArgumentException("La investigacion debe tener maximo 200 caracteres");
        }

        if(this.value.isBlank()) {
            throw new IllegalArgumentException("Investigacion invalida");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Investigacion)) return false;
        Investigacion that = (Investigacion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
