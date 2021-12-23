package co.com.softka.TallerDDD.curso.values;

import co.com.sofka.domain.generic.Identity;

public class IdEstudiante extends Identity {

    public IdEstudiante(){

    }

    private IdEstudiante(String id){
        super(id);
    }

    public static IdEstudiante of(String id) {
        return new IdEstudiante(id);
    }
}
