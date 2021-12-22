package co.com.softka.TallerDDD.profesor;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.TallerDDD.profesor.values.IdMateria;
import co.com.softka.TallerDDD.profesor.values.Temas;

import java.util.Objects;

public class Materias extends Entity<IdMateria> {

    protected Temas temas;

    public Materias(IdMateria entityId, Temas temas) {
        super(entityId);
        this.temas = temas;
    }

    public void actualizarTemas(Temas temas){
            this.temas = Objects.requireNonNull(temas);
    }

    public Temas temas() {
        return temas;
    }
}
