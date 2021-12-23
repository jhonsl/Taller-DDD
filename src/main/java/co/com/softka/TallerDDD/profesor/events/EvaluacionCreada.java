package co.com.softka.TallerDDD.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.profesor.values.Calificacion;
import co.com.softka.TallerDDD.profesor.values.Calificado;
import co.com.softka.TallerDDD.profesor.values.IdEvaluacion;
import co.com.softka.TallerDDD.profesor.values.Temas;

public class EvaluacionCreada extends DomainEvent {

    private final IdEvaluacion idEvaluacion;
    private final Temas temas;
    private final Calificado calificado;
    private final Calificacion calificacion;

    public EvaluacionCreada(IdEvaluacion idEvaluacion, Temas temas, Calificado calificado, Calificacion calificacion) {
        super("Softka.profesor.evaluacionCreada");
        this.idEvaluacion = idEvaluacion;
        this.temas = temas;
        this.calificacion = calificacion;
        this.calificado = calificado;
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
