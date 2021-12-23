package co.com.softka.TallerDDD.clase;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.clase.events.*;
import co.com.softka.TallerDDD.clase.values.Duracion;
import co.com.softka.TallerDDD.clase.values.Estado;
import co.com.softka.TallerDDD.clase.values.IdClase;
import co.com.softka.TallerDDD.clase.values.Nombre;
import co.com.softka.TallerDDD.profesor.values.IdProfesor;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Clase extends AggregateEvent<IdClase>
{
    protected IdProfesor idProfesor;
    protected IdClase idClase;
    protected Nombre nombre;
    protected Duracion duracion;
    protected Estado estado;
    protected TrabajoEnClase trabajoEnClase;
    protected Set<Salon> salones;

    public Clase(IdClase entityId, Nombre nombre, Duracion duracion, Estado estado){
        super(entityId);
        appendChange(new ClaseCreada(nombre, duracion, estado)).apply();
    }

    private Clase(IdClase entityId) {
        super(entityId);
        subscribe(new ClaseChange(this));
    }

    public static Clase from(IdClase idClase, List<DomainEvent> events) {
        var clase = new Clase(idClase);
        events.forEach(clase::applyEvent);

        return clase;
    }

    protected Optional<Salon> getClaseById(IdClase entityId){
        Objects.requireNonNull(entityId);

        return salones()
                .stream()
                .filter(salon -> salon.identity().equals(entityId))
                .findFirst();
    }

    public void iniciarClase(IdClase entityId, Estado estado){
        Objects.requireNonNull(entityId);

        appendChange(new ClaseIniciada(entityId, estado)).apply();
    }

    public void terminarClase(IdClase entityId, Estado estado){
        Objects.requireNonNull(entityId);

        appendChange(new ClaseTerminada(entityId, estado)).apply();
    }

    public Estado estado() {
        return estado;
    }

    public IdClase idClase() {
        return idClase;
    }

    public IdProfesor idProfesor() {
        return idProfesor;
    }

    public Duracion duracion() {
        return duracion;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Set<Salon> salones() {
        return salones;
    }

    public TrabajoEnClase trabajo_en_clase() {
        return trabajoEnClase;
    }
}
