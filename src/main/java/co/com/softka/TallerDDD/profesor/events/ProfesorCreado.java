package co.com.softka.TallerDDD.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.profesor.values.Edad;
import co.com.softka.TallerDDD.profesor.values.NombreProfesor;

public class ProfesorCreado extends DomainEvent {

    private final NombreProfesor nombreProfesor;
    private final Edad edad;

    public ProfesorCreado(NombreProfesor nombreProfesor, Edad edad) {
        super("Softka.profesor.ProfesorCreado");
        this.nombreProfesor = nombreProfesor;
        this.edad = edad;
    }

    public NombreProfesor getNombre() {
        return nombreProfesor;
    }

    public Edad getEdad() {
        return edad;
    }
}
