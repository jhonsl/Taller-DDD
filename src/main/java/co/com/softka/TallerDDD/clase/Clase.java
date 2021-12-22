package co.com.softka.TallerDDD.clase;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.softka.TallerDDD.clase.events.ClaseCreada;
import co.com.softka.TallerDDD.clase.values.Duracion;
import co.com.softka.TallerDDD.clase.values.IdClase;
import co.com.softka.TallerDDD.clase.values.Nombre;

public class Clase extends AggregateEvent<IdClase>
{
    protected Nombre nombre;
    protected Duracion duracion;
    protected Trabajo_en_clase trabajo_en_clase;
    protected Salon salon;

    public Clase(IdClase entityId, Duracion duracion)
    {
        super(entityId);
        appendChange(new ClaseCreada(nombre)).apply();
    }

    public void iniciarClase(){

    }

    public void terminarClase(){

    }

    public void agregarCurso(){

    }

    public void eliminarCurso(){

    }

    public void agregarProfesor(){

    }

    public void eliminarProfesor(){

    }
}
