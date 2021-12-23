package co.com.softka.TallerDDD.profesor.values;

import co.com.sofka.domain.generic.Identity;

public class IdProfesor extends Identity {

    public IdProfesor(){

    }

    private IdProfesor(String id){
        super(id);
    }

    public static IdProfesor of(String id) {
        return new IdProfesor(id);
    }
}
