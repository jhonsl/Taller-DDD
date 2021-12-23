package co.com.softka.TallerDDD.clase.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.clase.values.Duracion;
import co.com.softka.TallerDDD.clase.values.Estado;
import co.com.softka.TallerDDD.clase.values.Nombre;

public class ClaseCreada extends DomainEvent
{
    private final Nombre nombre;
    private final Duracion duracion;
    private final Estado estado;

    public ClaseCreada(Nombre nombre, Duracion duracion, Estado estado) {
        super("Softka.clase.claseCreada");
        this.nombre = nombre;
        this.duracion = duracion;
        this.estado = estado;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Estado getEstado()
    {
        return estado;
    }
}
