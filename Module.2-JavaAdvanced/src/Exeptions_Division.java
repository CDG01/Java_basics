/*
Scrivere due funzioni che accettino in input un numeratore e un denominatore e facciano la divisione:
- il primo metodo lancia un errore solo se numeratore o denominatore sono null SENZA CREARE UN ISTANZA (usa le eccezioni built-in di java). Gestisci l'eccezione fuori dal metodo.
  Nel caso il denominatore sia 0, restituisca infinity senza lanciare eccezioni.
- il secondo metodo lancia un eccezione solo se il denominatore è 0 e SENZA CREARE UN ISTANZA (usa le eccezioni built-in di java). Gestisci l'eccezione dentro il metodo.
 Nel caso il numeratore o il denominatore sia null, stampi una frase senza lanciare eccezioni.
 */


public class Exeptions_Division {
    public static void main(String[] args) {
        Integer numeratore = 6;
        Integer denominatore = 0;

        // GESTIONE DELL'ECCEZIONE DEL PRIMO METODO ALL'ESTERNO DEL METODO
        try {
            float result = divisionButNotNull(numeratore, denominatore);
            System.out.println("metodo divisionButNotNull(): non è stata lanciata alcuna eccezione e il risultato della divisione è " + result);
        } catch (Exception e) {
            System.out.println("metodo divisionButNotNull(): è stata lanciata e catturata l'eccezione con messaggio '" + e.getMessage() +"'");
        }

        // LA GESTIONE DELL'ECCEZIONE DEL SECONDO METODO ALL?INTERNO DEL METODO

        if (numeratore==null || denominatore==null) {
            System.out.println("metodo divisionButNotByZero(): non è stata lanciata alcuna eccezione nonostante qualcosa è null");
        } else {
            ButNotByZero(numeratore, denominatore);
        }
    }


    // METODO CHE NON LANCIA DA SOLO UN ECCEZIONE SE IL DENOMINATORE E' 0
    // ISTANZIO E LANCIO UN ECCEZIONE SE UNO DEI DUE OPERANDI E' null
    public static float divisionButNotNull(Integer numeratore, Integer denominatore) throws Exception{

            return (float) numeratore/denominatore;
            // Pensavo che la divisione per 0 avrebbe dato exception ma evidentemente no
            // Si può fare il casting dell'int Infinity a float

    }

    // METODO CHE LANCIA DA SOLO UN ECCEZIONE SE IL DENOMINATORE E' 0, SENZA CHE IO ISTANZI E LANCIA UNA NUOVA ECCEZIONE
    public static void ButNotByZero(int dividendo, int divisore) {
        try{
            System.out.println(dividendo/divisore);
        } catch (ArithmeticException e) {
            System.out.println("metodo ButNotByZero(): E' stata lanciata e cattaruata l'eccezione con messaggio '" + e.getMessage() + "'");
        }
    }
}

/* SPIEGAZIONE:

La divisione per zero in informatica non genera un'eccezione in quanto è definita come un'operazione
matematica che ha un risultato speciale: l'infinito o il valore simbolico "NaN" (Not a Number),
a seconda del contesto. Questo è particolarmente vero nei linguaggi di programmazione che supportano
l'aritmetica a virgola mobile.

Quando si divide per zero in Java, il risultato dipende dal tipo di dati utilizzato. Se si tratta di
numeri interi, la divisione per zero genera un'eccezione di tipo ArithmeticException, poiché la divisione
per zero non è definita per numeri interi. Tuttavia, se si utilizzano tipi di dati a virgola mobile come
float o double, la divisione per zero restituisce il valore Infinity o NaN senza generare un'eccezione.
 */