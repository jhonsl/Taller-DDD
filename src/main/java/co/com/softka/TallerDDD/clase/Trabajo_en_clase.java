package co.com.softka.TallerDDD.clase;

import co.com.sofka.domain.generic.Entity;
import co.com.softka.TallerDDD.clase.values.Calificacion;
import co.com.softka.TallerDDD.clase.values.IdTrabajoEnClase;
import co.com.softka.TallerDDD.clase.values.Temas;

import java.util.Objects;

public class Trabajo_en_clase extends Entity<IdTrabajoEnClase>
{
    protected Temas temas;
    protected Calificacion calificacion;

    public Trabajo_en_clase(IdTrabajoEnClase entityId, Temas temas, Calificacion calificacion) {
        super(entityId);
        this.temas = temas;
        this.calificacion = calificacion;
    }

    public void actualizarTemas(Temas temas){
        this.temas = Objects.requireNonNull(temas);
    }

    public Temas temas() {
        return temas;
    }

    public Calificacion calificacion() {
        return calificacion;
    }
}
