package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.Identity;
import co.com.softka.TallerDDD.clase.values.IdTrabajoEnClase;

public class IdCurso extends Identity {

    public IdCurso(){

    }

    private IdCurso(String id){
        super(id);
    }

    public static IdCurso of(String id) {
        return new IdCurso(id);
    }
}
