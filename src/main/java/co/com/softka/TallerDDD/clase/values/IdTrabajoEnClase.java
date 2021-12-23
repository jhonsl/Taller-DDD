package co.com.softka.TallerDDD.clase.values;

import co.com.sofka.domain.generic.Identity;

public class IdTrabajoEnClase extends Identity {

    public IdTrabajoEnClase(){

    }

    private IdTrabajoEnClase(String id){
        super(id);
    }

    public static IdTrabajoEnClase of(String id) {
        return new IdTrabajoEnClase(id);
    }
}
