package co.com.softka.TallerDDD.clase.commands;

import co.com.sofka.domain.generic.Command;
import co.com.softka.TallerDDD.clase.values.Duracion;
import co.com.softka.TallerDDD.clase.values.Estado;
import co.com.softka.TallerDDD.clase.values.Nombre;

public class CrearClase extends Command {

    private final Nombre nombre;
    private final Duracion duracion;
    private final Estado estado;

    public CrearClase(Nombre nombre, Duracion duracion, Estado estado) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.estado = estado;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Estado getEstado() {
        return estado;
    }
}
