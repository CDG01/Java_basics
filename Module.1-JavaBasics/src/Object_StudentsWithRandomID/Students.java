package Object_StudentsWithRandomID;

import java.util.UUID;

public class Students {
    // ATTRIBUTI
    private String name;
    private String surname;
    private String ID;

    // METODI

    // costruttore
    public Students(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.ID = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
