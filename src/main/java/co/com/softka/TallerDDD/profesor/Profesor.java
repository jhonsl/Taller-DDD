package co.com.softka.TallerDDD.profesor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.softka.TallerDDD.curso.values.Edad;
import co.com.softka.TallerDDD.profesor.values.IdProfesor;
import co.com.softka.TallerDDD.profesor.values.Nombre;

public class Profesor extends AggregateEvent<IdProfesor> {

    protected Nombre nombre;
    protected Edad edad;
    protected Evaluacion evaluacion;
    protected Materias materias;

    public Profesor(IdProfesor entityId) {
        super(entityId);
    }

    public void crearEvaluacion(){

    }

    public void calificarEvaluacion(){

    }

    public void calificarTrea(){

    }

    public void calificarTrabajoEnClase(){

    }

    public void explicarMateria(){

    }
}
