package co.com.softka.TallerDDD.clase.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.Objects;

public class Temas implements ValueObject<ArrayList<String>> {

    private final ArrayList<String> value;

    public Temas(ArrayList<String> value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public void validaciones() {
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("Debe haber almenos un tema");
        }
        value.forEach(tema -> {
            if(tema.length() <= 5){
                throw new IllegalArgumentException("La longitud de cada tema debe ser mayor a 5 carateres");
            }
        });
    }

    public ArrayList<String> value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temas)) return false;
        Temas temas = (Temas) o;
        return Objects.equals(value, temas.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
