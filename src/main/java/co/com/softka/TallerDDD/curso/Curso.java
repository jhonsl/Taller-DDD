package co.com.softka.TallerDDD.curso;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.softka.TallerDDD.clase.values.IdClase;
import co.com.softka.TallerDDD.curso.values.CantidadDeEstudiantes;
import co.com.softka.TallerDDD.curso.values.Jornada;

public class Curso extends AggregateEvent<IdClase> {

    protected Jornada jornada;
    protected CantidadDeEstudiantes cantidadDeEstudiantes;
    protected Estudiante estudiante;
    protected Tarea tarea;

    public Curso(IdClase entityId) {
        super(entityId);
    }

    public void agregarEstudiante(){

    }

    public void eliminarEstudiante(){

    }
}
