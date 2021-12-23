package co.com.softka.TallerDDD.profesor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.softka.TallerDDD.clase.values.IdTrabajoEnClase;
import co.com.softka.TallerDDD.curso.values.IdTarea;
import co.com.softka.TallerDDD.profesor.events.*;
import co.com.softka.TallerDDD.profesor.values.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Profesor extends AggregateEvent<IdProfesor> {

    protected NombreProfesor nombreProfesor;
    protected Edad edad;
    protected Set<Evaluacion> evaluaciones;
    protected Set<Materia> materias;

    public Profesor(IdProfesor entityId, NombreProfesor nombreProfesor, Edad edad) {
        super(entityId);
        appendChange(new ProfesorCreado(nombreProfesor,edad)).apply();
    }

    private Profesor(IdProfesor entityId) {
        super(entityId);
        subscribe(new ProfesorChange(this));
    }

    protected Optional<Materia> getMateriaById(IdMateria entityId){
        return materias()
                .stream()
                .filter(materia -> materia.identity().equals(entityId))
                .findFirst();
    }

    protected Optional<Evaluacion> getEvaluacionById(IdEvaluacion entityId){
        return evaluaciones()
                .stream()
                .filter(evaluacion -> evaluacion.identity().equals(entityId))
                .findFirst();
    }

    public void crearEvaluacion(IdEvaluacion entityId, Temas temas, Calificado calificado, Calificacion calificacion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(temas);
        Objects.requireNonNull(calificacion);

        appendChange(new EvaluacionCreada(entityId, temas, calificado, calificacion)).apply();
    }

    public void calificarEvaluacion(IdEvaluacion entityId, Calificado calificado){
        Objects.requireNonNull(entityId);

        appendChange(new EvaluacionCalificada(entityId, calificado)).apply();;
    }

    public void explicarMateria(IdMateria entityId, Estado estado){
        Objects.requireNonNull(entityId);

        appendChange(new MateriaExplicada(entityId, estado)).apply();
    }

    public NombreProfesor nombre() {
        return nombreProfesor;
    }

    public Edad edad() {
        return edad;
    }

    public Set<Evaluacion> evaluaciones() {
        return evaluaciones;
    }

    public Set<Materia> materias() {
        return materias;
    }
}
