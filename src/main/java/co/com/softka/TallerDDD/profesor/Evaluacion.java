package co.com.softka.TallerDDD.profesor;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.TallerDDD.profesor.values.Calificacion;
import co.com.softka.TallerDDD.profesor.values.Calificado;
import co.com.softka.TallerDDD.profesor.values.IdEvaluacion;
import co.com.softka.TallerDDD.profesor.values.Temas;

public class Evaluacion extends Entity<IdEvaluacion> {

    protected Temas temas;
    protected Calificado calificado;
    protected Calificacion calificacion;

    public Evaluacion(IdEvaluacion entityId, Temas temas, Calificado calificado, Calificacion calificacion) {
        super(entityId);
        this.temas = temas;
        this.calificado = calificado;
        this.calificacion = calificacion;
    }

    public void comenzarEvaluacion(){
        System.out.println("La evaluacion ha comenzado");
    }

    public void terminarEvaluacion(){
        System.out.println("La evaluacion ha comenzado");
    }

    public Temas temas() {
        return temas;
    }

    public Calificado calificado() {
        return calificado;
    }

    public Calificacion calificacion() {
        return calificacion;
    }
}
