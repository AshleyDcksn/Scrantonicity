package parkour.office.groovy;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import static parkour.office.groovy.common.TwilioConst.*;

public class SendMessage {

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+14159352345"), // to
                        new PhoneNumber(TWILIO_PHONE_NUMBER), // from
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}


