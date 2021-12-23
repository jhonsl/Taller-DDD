package co.com.softka.TallerDDD.profesor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Estado implements ValueObject<String> {

    private final String value;

    public Estado(String value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public void validaciones(){

        if(this.value.isBlank()){
            throw new IllegalArgumentException("Estado no valido");
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
        if (!(o instanceof Estado)) return false;
        Estado estado = (Estado) o;
        return Objects.equals(value, estado.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
