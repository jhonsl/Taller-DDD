package co.com.softka.TallerDDD.clase.commands;

import co.com.sofka.domain.generic.Command;
import co.com.softka.TallerDDD.clase.values.IdSalon;

public class SonarTimbre extends Command {

    private final IdSalon idSalon;

    public SonarTimbre(IdSalon idSalon) {
        this.idSalon = idSalon;
    }

    public IdSalon getIdSalon() {
        return idSalon;
    }
}
