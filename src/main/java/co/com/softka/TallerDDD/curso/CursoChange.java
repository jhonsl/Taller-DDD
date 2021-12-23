package co.com.softka.TallerDDD.curso;

import co.com.sofka.domain.generic.EventChange;
import co.com.softka.TallerDDD.curso.events.CursoCreado;
import co.com.softka.TallerDDD.curso.events.EstudianteAgregado;
import co.com.softka.TallerDDD.curso.events.EstudianteEliminado;

import java.util.HashSet;

public class CursoChange extends EventChange {
    public CursoChange(Curso curso) {

        apply((CursoCreado event) -> {
            curso.cantidadDeEstudiantes = event.getCantidadDeEstudiantes();
            curso.jornada = event.getJornada();
            curso.estudiantes = new HashSet<>();
        });

        apply((EstudianteAgregado event) -> {
            var numEstudiantes= curso.estudiantes().size();
            if(numEstudiantes == 30){
                throw new IllegalArgumentException("No se pueden tener mas estudiantes");
            }
            curso.estudiantes.add(new Estudiante(
                    event.getIdEstudiante(),
                    event.getNombre(),
                    event.getEdad(),
                    event.getPuesto(),
                    event.getPromedio()
            ));
        });

        apply((EstudianteEliminado event) -> {
            var estudiante = curso.getEstudianteById(event.getIdEstudiante())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el estudiante deseado"));

            curso.eliminarEstudiante(estudiante.identity());
        });
    }
}
