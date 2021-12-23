package co.com.softka.TallerDDD.profesor.commands;

import co.com.sofka.domain.generic.Command;
import co.com.softka.TallerDDD.profesor.values.Temas;

public class ActualizarTemas extends Command {

    private final Temas temas;

    public ActualizarTemas(Temas temas) {
        this.temas = temas;
    }

    public Temas getTemas() {
        return temas;
    }
}
