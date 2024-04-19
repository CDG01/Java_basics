package DesignPattern.SenzaBuilderPattern_Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person()
                .setName("Bob")
                .setHairColor("Black")
                .setEyeColor("Brown");
    }
}
