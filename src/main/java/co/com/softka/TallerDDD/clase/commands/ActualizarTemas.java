package co.com.softka.TallerDDD.clase.commands;

import co.com.sofka.domain.generic.Command;
import co.com.softka.TallerDDD.clase.values.IdTrabajoEnClase;
import co.com.softka.TallerDDD.clase.values.Temas;

public class ActualizarTemas extends Command {

    private final IdTrabajoEnClase idTrabajoEnClase;
    private final Temas temas;

    public ActualizarTemas(IdTrabajoEnClase idTrabajoEnClase, Temas temas) {
        this.idTrabajoEnClase = idTrabajoEnClase;
        this.temas = temas;
    }

    public IdTrabajoEnClase getIdTrabajoEnClase() {
        return idTrabajoEnClase;
    }

    public Temas getTemas() {
        return temas;
    }
}
