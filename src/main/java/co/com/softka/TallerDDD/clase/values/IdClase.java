package co.com.softka.TallerDDD.clase.values;

import co.com.sofka.domain.generic.Identity;

public class IdClase extends Identity {

    public IdClase(){

    }

    private IdClase(String id){
        super(id);
    }

    public static IdClase of(String id) {
        return new IdClase(id);
    }
}
