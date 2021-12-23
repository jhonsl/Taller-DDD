package co.com.softka.TallerDDD.clase.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Lugar implements ValueObject<String>
{

    private final String value;

    public Lugar(String value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
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

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lugar)) return false;
        Lugar lugar = (Lugar) o;
        return Objects.equals(value, lugar.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
