package DesignPattern.BuilderPattern_Person;

/*
Implemento due tipi di builder:
    PersonBuilderExternal: Builder esterno alla classe, non statico
    PeronBuilderInternal: Builder interno alla classe statico
Implemento due modi diversi per obbligare l'assegnazione delle variabili firstName e lastName
 MODO1 (implementato in PersonBuilderExternal): obbligo l'assegnazione attraverso l'implementazione di un costruttore nel BUilder
 MODO2 (implementato in PersonBuilderInternal): obbligo l'assegnazione attraverso il lancio di un RunTimeException nel caso non vengano assegnati dei valori
 */

public class Main {
    public static void main(String[] args) {
        PersonBuilderExternal personBuilderExternal = new PersonBuilderExternal("nome1","cognome1");
        Person person1 = personBuilderExternal
                .setAge(1)
                .setAddress("indirizzo1")
                .build();
        System.out.println(person1);

        Person.PersonBuilderInternal personBuilderInternal = new Person.PersonBuilderInternal();
        Person person2 = personBuilderInternal
                .setFirstName("nome2")
                .setLastName("cognome2")
                .build();
        System.out.println(person2);


    }
}
