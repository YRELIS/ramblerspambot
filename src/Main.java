import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Multipart;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.*;

public class Main
{


    public static void main(String args[]) throws Exception
    {
        String host = "mail.rambler.ru";
        String from = "bot-spam@rambler.ru";
        String to = "yrelisss@rambler.ru";
        Properties props = System.getProperties();
        props.put("mail.smtp.host", host);
        class MyAuthenticator extends Authenticator
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication("bot-spam@rambler.ru", "12345678qwerty");
            }
        }
        for(int i = 1; i<500; i++)
        {
            props.put("mail.smtp.auth", "true");
            Session defSession = Session.getDefaultInstance(props, new MyAuthenticator());
            defSession.setDebug(true);
            Message message = new MimeMessage(defSession);
            message.setSubject("Message DDos_"+i);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setContent("Ya RoDiLsY !!1!!11!1odin1!", "text/plain");
            Transport.send(message, message.getRecipients(Message.RecipientType.TO));
            //System.out.wait(0,4000);
            Thread.sleep(4000);
        }
    }
}


