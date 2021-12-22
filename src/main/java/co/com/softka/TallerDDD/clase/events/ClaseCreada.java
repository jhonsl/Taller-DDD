package co.com.softka.TallerDDD.clase.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.clase.values.Nombre;

public class ClaseCreada extends DomainEvent
{
    private final Nombre nombre;

    public ClaseCreada(Nombre nombre)
    {
        super("Softka.clase.claseCreada");
        this.nombre = nombre;
    }

    public Nombre getNombre()
    {
        return nombre;
    }
}
