/*
In Java, T è un tipo generico che rappresenta un parametro di tipo.
Quando si dichiara una classe, interfaccia o metodo generico,
T può essere sostituito con qualsiasi tipo di dati al momento dell'utilizzo.

Ad esempio, quando si dichiara una classe generica ClasseGenerica<T>,
T è il parametro di tipo che può essere sostituito con qualsiasi tipo di dati
al momento della creazione di un'istanza della classe.

Nell'esempion seguente, T è un parametro di tipo che rappresenta il tipo del dato che sarà memorizzato all'interno
dell'oggetto ClasseGenerica. Quando si crea un'istanza di ClasseGenerica, è possibile specificare il tipo di dato che
si desidera utilizzare al posto di T.
 */



package TypeParameter_Explanation;



public class Main {
    public static void main(String[] args) {
        ClasseGenerica<String> oggettoStringa = new ClasseGenerica<>();
        oggettoStringa.setElemento("Esempio di stringa");
        String elementoStringa = oggettoStringa.getElemento(); // elementoStringa contiene "Esempio di stringa"

        ClasseGenerica<Integer> oggettoInteri = new ClasseGenerica<>();
        oggettoInteri.setElemento(123);
        Integer elementoIntero = oggettoInteri.getElemento(); // elementoIntero contiene 123
    }

    /*
    In questo modo, T viene sostituito rispettivamente con String e Integer quando
    si creano le istanze di ClasseGenerica, consentendo all'oggetto di memorizzare
    e restituire dati di tipo diverso in base alla specifica istanza.
     */
}

