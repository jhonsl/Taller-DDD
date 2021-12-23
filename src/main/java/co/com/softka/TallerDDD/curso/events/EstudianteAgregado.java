package co.com.softka.TallerDDD.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.curso.values.*;

public class EstudianteAgregado extends DomainEvent {

    private final IdEstudiante idEstudiante;
    private final Nombre nombre;
    private final Edad edad;
    private final Puesto puesto;
    private final Promedio promedio;

    public EstudianteAgregado(IdEstudiante idEstudiante, Nombre nombre, Edad edad, Puesto puesto, Promedio promedio) {
        super("Softka.curso.estudianteAgregado");
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.promedio = promedio;
    }

    public IdEstudiante getIdEstudiante() {
        return idEstudiante;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Edad getEdad() {
        return edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Promedio getPromedio() {
        return promedio;
    }
}
