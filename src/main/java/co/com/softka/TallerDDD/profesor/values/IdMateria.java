package co.com.softka.TallerDDD.profesor.values;

import co.com.sofka.domain.generic.Identity;

public class IdMateria extends Identity {

    public IdMateria(){

    }

    private IdMateria(String id){
        super(id);
    }

    public static IdMateria of(String id) {
        return new IdMateria(id);
    }
}
