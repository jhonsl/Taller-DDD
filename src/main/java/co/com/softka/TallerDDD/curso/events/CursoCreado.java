package co.com.softka.TallerDDD.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.curso.values.CantidadDeEstudiantes;
import co.com.softka.TallerDDD.curso.values.Jornada;

public class CursoCreado extends DomainEvent {

    private final Jornada jornada;
    private final CantidadDeEstudiantes cantidadDeEstudiantes;

    public CursoCreado(Jornada jornada, CantidadDeEstudiantes cantidadDeEstudiantes) {
        super("Softka.curso.cursoCreado");
        this.jornada = jornada;
        this.cantidadDeEstudiantes = cantidadDeEstudiantes;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public CantidadDeEstudiantes getCantidadDeEstudiantes() {
        return cantidadDeEstudiantes;
    }
}
