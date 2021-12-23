package co.com.softka.TallerDDD.profesor;

import co.com.sofka.domain.generic.EventChange;
import co.com.softka.TallerDDD.profesor.events.*;

import java.util.HashSet;

public class ProfesorChange extends EventChange {
    public ProfesorChange(Profesor profesor) {

        apply((EvaluacionCalificada event) -> {
            var evaluacion = profesor.getEvaluacionById(event.getIdEvaluacion())
                    .orElseThrow(() -> new IllegalArgumentException("La evaluacion no existe"));

            evaluacion.calificado = event.getCalificado();
        });

        apply((EvaluacionCreada event) -> {
            profesor.evaluaciones.add(new Evaluacion(
                    event.getIdEvaluacion(),
                    event.getTemas(),
                    event.getCalificado(),
                    event.getCalificacion()
            ));
        });

        apply((MateriaExplicada event) -> {
            var materia = profesor.getMateriaById(event.getIdMateria())
                    .orElseThrow(() -> new IllegalArgumentException("Materia no encontrada"));

            materia.estado = event.getEstado();
        });

        apply((ProfesorCreado event) -> {
                profesor.nombreProfesor = event.getNombre();
                profesor.edad =event.getEdad();
                profesor.evaluaciones = new HashSet<>();
                profesor.materias = new HashSet<>();
        });
    }
}
