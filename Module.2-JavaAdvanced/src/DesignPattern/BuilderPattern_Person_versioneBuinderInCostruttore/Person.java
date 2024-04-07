package DesignPattern.BuilderPattern_Person_versioneBuinderInCostruttore;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Person(PersonBuilder personBuilder) { // passando il costruttore, diminuiamo il numero di paramentri del costruttore di Person
        this.firstName = personBuilder.getFirstName();
        this.lastName = personBuilder.getLastName();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", age: " + age +
                ", address: '" + address + '\'' +
                ']';
    }

}