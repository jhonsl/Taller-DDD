package co.com.softka.TallerDDD.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.curso.values.IdEstudiante;

public class EstudianteEliminado extends DomainEvent {

    private final IdEstudiante idEstudiante;

    public EstudianteEliminado(IdEstudiante idEstudiante) {
        super("Softka.curso.estudianteEliminado");
        this.idEstudiante = idEstudiante;
    }

    public IdEstudiante getIdEstudiante() {
        return idEstudiante;
    }
}
