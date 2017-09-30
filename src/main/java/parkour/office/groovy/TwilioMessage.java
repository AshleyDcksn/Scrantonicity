package parkour.office.groovy;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import parkour.office.groovy.model.ScottMessage;

import static parkour.office.groovy.common.TwilioConst.*;

public class TwilioMessage {

    public void sendMessage(String phoneNumber, ScottMessage scottMessage) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber(phoneNumber), // to
                        new PhoneNumber(TWILIO_PHONE_NUMBER), // from
                        scottMessage.getQuote() + "\n- " + scottMessage.getAuthor())
                .create();
        System.out.println(message.getSid());
}
}


