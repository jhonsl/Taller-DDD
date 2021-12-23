package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public String value() {
        return value;
    }

    public void validaciones(){

        if(this.value.isBlank()){
            throw new IllegalArgumentException("Lugar no valido");
        }

        if(this.value.length() <= 5){
            throw new IllegalArgumentException("La longitud debe ser mayor a 5 caracteress");
        }

        if(this.value.length() >= 100){
            throw new IllegalArgumentException("La longitud debe ser menor a 100 caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Nombre)) return false;
        Nombre nombre = (Nombre) o;
        return Objects.equals(value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
