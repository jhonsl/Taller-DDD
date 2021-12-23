package co.com.softka.TallerDDD.curso;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.TallerDDD.curso.values.*;

import java.util.Objects;

public class Tarea extends Entity<IdTarea> {

    protected Temas temas;
    protected Investigacion investigacion;

    public Tarea(IdTarea entityId, Temas temas, Investigacion investigacion) {
        super(entityId);
        this.temas = temas;
        this.investigacion = investigacion;
    }

    public void actualizarTemas(Temas temas){
        this.temas = Objects.requireNonNull(temas);
    }

    public Temas temas() {
        return temas;
    }

    public Investigacion investigacion() {
        return investigacion;
    }
}
