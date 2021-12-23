package co.com.softka.TallerDDD.profesor.commands;

import co.com.sofka.domain.generic.Command;
import co.com.softka.TallerDDD.profesor.values.Estado;
import co.com.softka.TallerDDD.profesor.values.IdMateria;

public class ExplicarMateria extends Command {

    private final IdMateria idMateria;
    private final Estado estado;

    public ExplicarMateria(IdMateria idMateria, Estado estado) {
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
