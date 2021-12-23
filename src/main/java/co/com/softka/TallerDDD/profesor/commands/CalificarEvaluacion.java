package co.com.softka.TallerDDD.profesor.commands;

import co.com.sofka.domain.generic.Command;
import co.com.softka.TallerDDD.profesor.values.Calificacion;
import co.com.softka.TallerDDD.profesor.values.Calificado;
import co.com.softka.TallerDDD.profesor.values.IdEvaluacion;

public class CalificarEvaluacion extends Command {

    private final IdEvaluacion idEvaluacion;
    private final Calificado calificado;
    private final Calificacion calificacion;

    public CalificarEvaluacion(IdEvaluacion idEvaluacion, Calificado calificado, Calificacion calificacion) {
        this.idEvaluacion = idEvaluacion;
        this.calificado = calificado;
        this.calificacion = calificacion;
    }

    public IdEvaluacion getIdEvaluacion() {
        return idEvaluacion;
    }

    public Calificado getCalificado() {
        return calificado;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }
}