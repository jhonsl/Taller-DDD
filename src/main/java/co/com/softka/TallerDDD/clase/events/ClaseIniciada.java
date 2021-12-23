package co.com.softka.TallerDDD.clase.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.clase.values.Estado;
import co.com.softka.TallerDDD.clase.values.IdClase;

public class ClaseIniciada extends DomainEvent {

    private final IdClase idClase;
    private final Estado estado;

    public ClaseIniciada(IdClase idClase, Estado estado) {
        super("Softka.clase.claseIniciada");
        this.idClase = idClase;
        this.estado = estado;
    }

    public IdClase getIdClase() {
        return idClase;
    }

    public Estado getEstado() {
        return estado;
    }
}
