package co.com.softka.TallerDDD.curso;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.TallerDDD.curso.values.Calificacion;
import co.com.softka.TallerDDD.curso.values.IdTarea;
import co.com.softka.TallerDDD.curso.values.Investigacion;
import co.com.softka.TallerDDD.curso.values.Temas;

import java.util.Objects;

public class Tarea extends Entity<IdTarea> {

    protected Temas temas;
    protected Calificacion calificacion;
    protected Investigacion investigacion;

    public Tarea(IdTarea entityId, Temas temas, Calificacion calificacion, Investigacion investigacion) {
        super(entityId);
        this.temas = temas;
        this.calificacion = calificacion;
        this.investigacion = investigacion;
    }

    public void actualizarTemas(Temas temas){
        this.temas = Objects.requireNonNull(temas);
    }

    public Temas temas() {
        return temas;
    }

    public Calificacion calificacion() {
        return calificacion;
    }

    public Investigacion investigacion() {
        return investigacion;
    }
}
