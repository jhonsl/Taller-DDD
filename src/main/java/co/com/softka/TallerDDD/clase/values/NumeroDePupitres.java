package co.com.softka.TallerDDD.clase.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroDePupitres implements ValueObject<Integer>
{

    private final int value;

    public NumeroDePupitres(int value) {
        this.value = Objects.requireNonNull(value);
        validaciones();
    }

    public void validaciones() {
        if(this.value < 0){
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }

        if(this.value > 30) {
            throw new IllegalArgumentException("Solo puede haber 30 pupitres por salon");
        }
    }

    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumeroDePupitres)) return false;
        NumeroDePupitres that = (NumeroDePupitres) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
