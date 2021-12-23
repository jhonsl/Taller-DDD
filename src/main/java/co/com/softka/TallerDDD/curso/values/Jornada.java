package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Locale;
import java.util.Objects;

public class Jornada implements ValueObject<String> {

    private final String value;

    public Jornada(String value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public void validaciones() {

        String jornada = this.value.toUpperCase();

        if(jornada.isBlank()) {
            throw new IllegalArgumentException("Argumento invalido");
        }

        if(jornada.equals("MAÑANA") || jornada.equals("TARDE")) {
            throw new IllegalArgumentException("Jornada invalida");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jornada)) return false;
        Jornada jornada = (Jornada) o;
        return Objects.equals(value, jornada.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
