import java.util.Properties;

public class Main
{
    public static void main(String args[]) throws Exception
    {
        Setting set = new Setting();
        String host = "mail.rambler.ru";
        String from = "bot-spam@rambler.ru";
        String to = "yrelisss@rambler.ru";
        Properties props = System.getProperties();
        props.put("mail.smtp.host", host);
        set.SettingWork(to, from, props);
    }
}


