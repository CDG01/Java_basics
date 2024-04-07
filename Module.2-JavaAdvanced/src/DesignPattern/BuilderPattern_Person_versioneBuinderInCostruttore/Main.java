package DesignPattern.BuilderPattern_Person_versioneBuinderInCostruttore;

/* CONSEGNA:
Crea una classe Person con i campi firstName, lastName, age e address, i getter and i setter.
Il costruttore accetterà un Builder in input.
Creare una classe Builder che attraverso il costruttore e dei metodi specifici (tranne nome e cognome, gli altri campi sono opzionali) per costruire l'oggetto Person.
Creare due oggetti Person e stamparli a video.
*/


public class Main {


    public static void main(String[] args) {

        Person person1 = PersonBuilder.builder("nome1", "cognome1")
                .setAge(111)
                .setAddress("Via 1")
                .build();
        System.out.println("Person1: " + person1);

        Person person2 = PersonBuilder.builder("nome2", "cognome2")
                .build();
        System.out.println("Person2: " + person2);

    }

}