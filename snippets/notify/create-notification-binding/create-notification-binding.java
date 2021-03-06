import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.notify.v1.service.Notification;

public class Example {
    public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        
        List<String> listSendTo = new ArrayList<>();
        listSendTo.add("00000001");
        // listSendTo.add("00000002");
        Notification notification =
                Notification.creator("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
                        .setBody("Hello all.")
                        .setIdentity( listSendTo ).create();

        System.out.print("+ Notification SID: " + notification.getSid());
        System.out.print(", Text: " + notification.getBody());
        System.out.print(", Date: " + notification.getDateCreated());
        System.out.println("");
    }
}
