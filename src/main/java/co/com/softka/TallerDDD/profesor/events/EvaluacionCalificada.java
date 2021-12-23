package co.com.softka.TallerDDD.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.profesor.values.Calificado;
import co.com.softka.TallerDDD.profesor.values.IdEvaluacion;

public class EvaluacionCalificada extends DomainEvent {

    private final IdEvaluacion idEvaluacion;
    private final Calificado calificado;

    public EvaluacionCalificada(IdEvaluacion idEvaluacion, Calificado calificado) {
        super("Softka.profesor.evaluacionCalificada");
        this.idEvaluacion = idEvaluacion;
        this.calificado = calificado;
    }

    public IdEvaluacion getIdEvaluacion() {
        return idEvaluacion;
    }

    public Calificado getCalificado() {
        return calificado;
    }
}
