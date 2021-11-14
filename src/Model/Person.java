package Model;

public class Person {
    public int idPerson;
    public String firstname;
    public String lastname;
    // Pas de type prof ou eleve vu que ce son les personnes qui s'occupe des "groupes" qui font les eleves


    public Person(int idPerson, String firstname, String lastname) {
        this.idPerson = idPerson;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
