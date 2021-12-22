package co.com.softka.TallerDDD.clase;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.TallerDDD.clase.values.IdSalon;
import co.com.softka.TallerDDD.clase.values.Lugar;
import co.com.softka.TallerDDD.clase.values.NumeroDePupitres;

public class Salon extends Entity<IdSalon>
{
    protected Lugar lugar;
    protected NumeroDePupitres numeroDePupitres;

    public Salon(IdSalon entityId, Lugar lugar, NumeroDePupitres numeroDePupitres) {
        super(entityId);
        this.lugar = lugar;
        this.numeroDePupitres = numeroDePupitres;
    }

    public void sonarTimbre(){
        System.out.println("El timbre ha sonado");
    }

    public Lugar lugar() {
        return lugar;
    }

    public NumeroDePupitres numeroDePupitres() {
        return numeroDePupitres;
    }
}
