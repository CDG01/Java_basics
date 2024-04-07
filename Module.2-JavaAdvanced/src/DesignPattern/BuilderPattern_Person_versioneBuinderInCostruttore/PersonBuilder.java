package DesignPattern.BuilderPattern_Person_versioneBuinderInCostruttore;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    // scelgo di fare un costruttore accessibile solo da dentro la classe PersonBuider
    // obbligo l'assegnazione di firsName e lastName
    private PersonBuilder(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }



    // metodo per sfornare una nuova istanza
    public static PersonBuilder builder(String firstName, String lastName) {
        return new PersonBuilder( firstName,  lastName);
    }


    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    // i getter diventano necessari nel PersonBuilder dal momento in cui devo usarli quando passo il PersonBuilder nel costruttore di Person


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public Person build() {
        return new Person(this);
    }

}