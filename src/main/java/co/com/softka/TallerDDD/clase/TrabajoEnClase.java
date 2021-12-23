package co.com.softka.TallerDDD.clase;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.TallerDDD.clase.values.IdTrabajoEnClase;
import co.com.softka.TallerDDD.clase.values.Temas;

import java.util.Objects;

public class TrabajoEnClase extends Entity<IdTrabajoEnClase>
{
    protected Temas temas;

    public TrabajoEnClase(IdTrabajoEnClase entityId, Temas temas) {
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
