package DesignPattern.BuilderPattern_Person_versioneBuinderInCostruttore;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    // scelgo di fare un costruttore accessibile solo da dentro la classe Person
    private PersonBuilder() {}



    // metodo per sfornare una nuova istanza
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
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