package co.com.softka.TallerDDD.profesor.commands;

import co.com.sofka.domain.generic.Command;
import co.com.softka.TallerDDD.profesor.values.Calificacion;
import co.com.softka.TallerDDD.profesor.values.Calificado;
import co.com.softka.TallerDDD.profesor.values.IdEvaluacion;
import co.com.softka.TallerDDD.profesor.values.Temas;

public class CrearEvaluacion extends Command {

    private final IdEvaluacion idEvaluacion;
    private final Temas temas;
    private final Calificado calificado;
    private final Calificacion calificacion;

    public CrearEvaluacion(IdEvaluacion idEvaluacion, Temas temas, Calificado calificado, Calificacion calificacion) {
        this.idEvaluacion = idEvaluacion;
        this.temas = temas;
        this.calificado = calificado;
        this.calificacion = calificacion;
    }

    public IdEvaluacion getIdEvaluacion() {
        return idEvaluacion;
    }

    public Temas getTemas() {
        return temas;
    }

    public Calificado getCalificado() {
        return calificado;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}
