package co.com.softka.TallerDDD.profesor;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.TallerDDD.profesor.values.Estado;
import co.com.softka.TallerDDD.profesor.values.IdMateria;
import co.com.softka.TallerDDD.profesor.values.Temas;

import java.util.Objects;

public class Materia extends Entity<IdMateria> {

    protected Temas temas;
    protected Estado estado;

    public Materia(IdMateria entityId, Temas temas, Estado estado) {
        super(entityId);
        this.temas = temas;
        this.estado = estado;
    }

    public void actualizarTemas(Temas temas){
        this.temas = Objects.requireNonNull(temas);
    }

    public Temas temas() {
        return temas;
    }
}
