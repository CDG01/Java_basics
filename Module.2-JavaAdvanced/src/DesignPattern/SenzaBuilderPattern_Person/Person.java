package DesignPattern.SenzaBuilderPattern_Person;

/*
Si potrebbe bypassare la classe Builder e simularne l'approccio della costruzione delle istanze come in questo esempio
Però comporta "alterare" l'implementazione ordinaria dei setter
 */

public class Person {
    private String name;
    private String eyeColor;
    private String hairColor;

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    public Person setHairColor(String hairColor) {
        this.hairColor = hairColor;
        return this;
    }
}


