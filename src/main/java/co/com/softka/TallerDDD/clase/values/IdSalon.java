package co.com.softka.TallerDDD.clase.values;

import co.com.sofka.domain.generic.Identity;

public class IdSalon extends Identity {

    public IdSalon(){

    }

    private IdSalon(String id){
        super(id);
    }

    public static IdSalon of(String id) {
        return new IdSalon(id);
    }
}
