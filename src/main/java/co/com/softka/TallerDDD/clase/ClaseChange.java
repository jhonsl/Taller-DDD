package co.com.softka.TallerDDD.clase;

import co.com.sofka.domain.generic.EventChange;
import co.com.softka.TallerDDD.clase.events.*;

import java.util.HashSet;

public class ClaseChange extends EventChange {
    public ClaseChange(Clase clase) {

        apply((ClaseCreada event) -> {
            clase.nombre = event.getNombre();
            clase.duracion = event.getDuracion();
            clase.estado = event.getEstado();
            clase.salones = new HashSet<>();
        });

        apply((ClaseIniciada event) -> {
            clase.estado = event.getEstado();
        });

        apply((ClaseTerminada event) -> {
            clase.estado = event.getEstado();
        });
    }
}
