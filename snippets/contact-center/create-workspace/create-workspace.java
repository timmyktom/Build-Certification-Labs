// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.taskrouter.v1.Workspace;

import java.net.URI;

public class Example {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = System.getenv("ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("AUTH_TOKEN");

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Workspace workspace = Workspace.creator("NewWorkspace")
            .setTemplate("FIFO")
            .create();

        System.out.println(workspace.getSid());
    }
}
