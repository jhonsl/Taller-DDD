package co.com.softka.TallerDDD.profesor.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.softka.TallerDDD.profesor.values.Estado;
import co.com.softka.TallerDDD.profesor.values.IdMateria;

public class MateriaExplicada extends DomainEvent {

    private final IdMateria idMateria;
    private final Estado estado;

    public MateriaExplicada(IdMateria idMateria, Estado estado) {
        super("Softka.profesor.materialExplicado");
        this.idMateria = idMateria;
        this.estado = estado;
    }

    public IdMateria getIdMateria() {
        return idMateria;
    }

    public Estado getEstado() {
        return estado;
    }
}
