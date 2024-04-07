package Testing_stubAndMock.Mock_Email.Test;

import Testing_stubAndMock.Mock_Email.src.EmailSender;
import Testing_stubAndMock.Mock_Email.src.EmailService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*; // libreria di terze parti per fare i mock, non era presente nella JDK standard, quindi ho dovuto importare a mano la libreria che è nella cartella jar_files
/*
un mock è un pacchetto usato nella fase di testing, che al suo inteno può fare diverse cose
in questo esempio, lo usiamo per verificare che la la chiamata del metodo sendEmail riceva in input quello che ci aspettiamo
(non mi interessa come è fatta la classe che implementa l'interfaccia EmailSender, la astraggo completamentamente, so solo che avrà come metodo sendEmail il quale ritona un void e riceve due String
 */


// il mock, a differenza dello stub, non si concentra sul passaggio dei dati e la verifica che la logica del metodo funzioni
// il mock si concentra sul flusso del codice


public class EmailServiceTest { // classe dove testo i metodi della classe MailService

    @Test
    public void testSendWelcomeEmail() {
        // Creazione di un mock di una classe che implementa Email.src.EmailSender
        EmailSender mockEmailSender = mock(EmailSender.class);

        // Creazione di un oggetto Email.src.EmailService con il mock Email.src.EmailSender
        EmailService emailService = new EmailService(mockEmailSender);

        // Chiamata al metodo da testare
        emailService.sendWelcomeEmail("user@example.com");

        // Verifica che il metodo sendEmail del mock sia stato chiamato con i parametri che ci aspettiamo gli debbano arrivare (ovvero, verifico che il flusso è come mi aspetto perché verifico che le chiamate vengano fatte nel modo corretto)
        verify(mockEmailSender).sendEmail("user@example.com", "Benvenuto!");
    }
}


/* APPROFONDIMENTO SU .class :

    In Java, `.class` è utilizzato per ottenere l'oggetto `Class` associato a una classe specifica o a un tipo. L'oggetto `Class` rappresenta le informazioni sulla classe stessa durante l'esecuzione del programma. Può essere utilizzato per ottenere informazioni statiche sulla classe, come il nome della classe, i metodi disponibili, i campi, i costruttori, e così via.

    Ecco alcuni casi d'uso comuni di `.class`:

    1. **Ottenere l'oggetto `Class` di una classe**: Ad esempio, se hai una classe `MyClass`, puoi ottenere l'oggetto `Class` associato a essa chiamando `MyClass.class`. Questo può essere utile quando si desidera ottenere informazioni sulla classe durante l'esecuzione del programma.

    ```java
    Class<MyClass> myClassClass = MyClass.class;
    ```

    2. **Passare il tipo di classe come argomento**: In alcuni casi, è necessario passare il tipo di classe come argomento a un metodo o a un costruttore. Utilizzando `.class`, è possibile ottenere il tipo di classe in modo sicuro durante il tempo di compilazione.

    ```java
    public void printClassName(Class<?> clazz) {
        System.out.println(clazz.getName());
    }

    // Utilizzo
    printClassName(MyClass.class);
    ```

    3. **Creare istanze tramite reflection**: Con l'oggetto `Class`, è possibile creare nuove istanze di una classe durante l'esecuzione del programma utilizzando la reflection.

    ```java
    Class<MyClass> myClassClass = MyClass.class;
    MyClass instance = myClassClass.newInstance();
    ```

    In breve, l'utilizzo di `.class` su una classe in Java consente di ottenere informazioni sulla classe stessa durante l'esecuzione del programma e può essere utilizzato per una varietà di scopi, come la reflection, il passaggio del tipo di classe come argomento e altro ancora.
 */