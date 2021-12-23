package co.com.softka.TallerDDD.curso;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.softka.TallerDDD.clase.values.IdClase;
import co.com.softka.TallerDDD.curso.events.CursoCreado;
import co.com.softka.TallerDDD.curso.events.EstudianteAgregado;
import co.com.softka.TallerDDD.curso.events.EstudianteEliminado;
import co.com.softka.TallerDDD.curso.values.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Curso extends AggregateEvent<IdClase> {

    protected Jornada jornada;
    protected CantidadDeEstudiantes cantidadDeEstudiantes;
    protected Set<Estudiante> estudiantes;
    protected Set<Tarea> tareas;

    public Curso(IdClase entityId, Jornada jornada, CantidadDeEstudiantes cantidadDeEstudiantes) {
        super(entityId);
        appendChange(new CursoCreado(jornada, cantidadDeEstudiantes)).apply();
    }

    private Curso(IdClase entityId) {
        super(entityId);
        subscribe(new CursoChange(this));
    }

    protected Optional<Tarea> getTareaById(IdTarea identityId) {
        Objects.requireNonNull(entityId);

        return tareas().stream().filter(tarea -> tarea.identity().equals(identityId)).findFirst();
    }

    protected Optional<Estudiante> getEstudianteById(IdEstudiante identityId) {
        Objects.requireNonNull(entityId);

        return estudiantes().stream().filter(estudiante -> estudiante.identity().equals(identityId)).findFirst();
    }

    public void agregarEstudiante(IdEstudiante entityId, Nombre nombre, Edad edad, Puesto puesto, Promedio promedio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(edad);
        Objects.requireNonNull(puesto);
        Objects.requireNonNull(promedio);

        appendChange(new EstudianteAgregado(entityId, nombre, edad, puesto, promedio)).apply();
    }

    public void eliminarEstudiante(IdEstudiante entityId){
        Objects.requireNonNull(entityId);

        appendChange(new EstudianteEliminado(entityId)).apply();
    }

    public Jornada jornada() {
        return jornada;
    }

    public CantidadDeEstudiantes cantidadDeEstudiantes() {
        return cantidadDeEstudiantes;
    }

    public Set<Estudiante> estudiantes() {
        return estudiantes;
    }

    public Set<Tarea> tareas() {
        return tareas;
    }
}
