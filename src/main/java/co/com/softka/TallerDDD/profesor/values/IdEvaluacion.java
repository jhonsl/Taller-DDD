package co.com.softka.TallerDDD.profesor.values;

import co.com.sofka.domain.generic.Identity;
import co.com.softka.TallerDDD.curso.values.IdTarea;

public class IdEvaluacion extends Identity {

    public IdEvaluacion(){

    }

    private IdEvaluacion(String id){
        super(id);
    }

    public static IdEvaluacion of(String id) {
        return new IdEvaluacion(id);
    }
}
