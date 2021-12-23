package co.com.softka.TallerDDD.profesor.commands;

import co.com.sofka.domain.generic.Command;
import co.com.softka.TallerDDD.profesor.values.Estado;
import co.com.softka.TallerDDD.profesor.values.IdEvaluacion;

public class TerminarEvaluacion extends Command {

    private final IdEvaluacion idEvaluacion;
    private final Estado estado;

    public TerminarEvaluacion(IdEvaluacion idEvaluacion, Estado estado) {
        this.idEvaluacion = idEvaluacion;
        this.estado = estado;
    }

    public IdEvaluacion getIdEvaluacion() {
        return idEvaluacion;
    }

    public Estado getEstado() {
        return estado;
    }
}
