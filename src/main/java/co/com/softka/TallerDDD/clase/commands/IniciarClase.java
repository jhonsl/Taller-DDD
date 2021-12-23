package co.com.softka.TallerDDD.clase.commands;

import co.com.sofka.domain.generic.Command;
import co.com.softka.TallerDDD.clase.values.Estado;
import co.com.softka.TallerDDD.clase.values.IdClase;

public class IniciarClase extends Command {

    private final IdClase idClase;
    private final Estado estado;

    public IniciarClase(IdClase idClase, Estado estado) {
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
