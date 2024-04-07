package Testing_stubAndMock.Mock_Email.src;

/*
Voglio testare EmailService ma la classe che implementa EmailSender non cel'ho pronta

MailSender sarà la classe responsabile dell'invio effettivo dell'email
 */

public class EmailService {
    private EmailSender emailSender; // dipendenza di EmailSender da un'interfaccia (ma il discorso è equivalente se la dipendenza fosse stata da una una classe esterna)

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendWelcomeEmail(String recipient) {
        String message = "Benvenuto!";
        emailSender.sendEmail(recipient, message);
    }
}