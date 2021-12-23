package co.com.softka.TallerDDD.curso;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.TallerDDD.curso.values.*;

public class Estudiante extends Entity<IdEstudiante> {

    protected Nombre nombre;
    protected Edad edad;
    protected Puesto puesto;
    protected Promedio promedio;

    public Estudiante(IdEstudiante entityId, Nombre nombre, Edad edad, Puesto puesto, Promedio promedio) {
        super(entityId);
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
        this.promedio = promedio;
    }

    public void hacerTarea(){
        System.out.println(this.nombre() + " ha hecho la tarea");
    }

    public void resolverEvaluacion(){
        System.out.println(this.nombre() + " ha resuelto la evaluacion");
    }

    public void resolverTrabajoEnClase(){
        System.out.println(this.nombre() + " ha resuelto el trabajo en clase");
    }

    public void actualizarPromedio(Promedio promedio){
        this.promedio = promedio;
    }

    public void actualizarPuesto(Puesto puesto){
        this.puesto = puesto;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Edad edad() {
        return edad;
    }

    public Puesto puesto() {
        return puesto;
    }

    public Promedio promedio() {
        return promedio;
    }
}
