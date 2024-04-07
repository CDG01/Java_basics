package DesignPattern.DesignPattern_BuilderOfPerson;

public class PersonBuilderExternal {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public PersonBuilderExternal(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilderExternal setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilderExternal setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build(){
        return new Person(this.firstName, this.lastName, this.age, this.address);
    }
}


