package DesignPattern.DesignPattern_BuilderOfPerson;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
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

    // stampo solo gli attributi che sono stati valorizzati con valori diersi da quelli di default
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\''
                +( (age != 0)? ", age=" + age : "")
                +( (address != null)? ", address='" + address: "")
                + '}';
    }

    public static class PersonBuilderInternal {
        private String firstName;
        private String lastName;
        private int age;
        private String address;

        public PersonBuilderInternal setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilderInternal setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilderInternal setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilderInternal setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build(){
            if (this.firstName.isEmpty() || this.lastName.isEmpty()){
                throw new RuntimeException();
            }
            return new Person(firstName, lastName, age, address);
        }
    }
}
