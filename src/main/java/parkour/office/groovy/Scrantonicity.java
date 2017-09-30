package parkour.office.groovy;

import parkour.office.groovy.model.ScottMessage;

public class Scrantonicity {

    public static void main(String[] args){
        String phoneNumber = args[0];
        ScottDao scottDao = new ScottDao();
        ScottMessage scottMessage =new ScottMessage();
        scottMessage = scottDao.getScottMessage();
        System.out.println("my scott message " + scottMessage.getQuote() + scottMessage.getAuthor());
        TwilioMessage twilioMessage = new TwilioMessage();
        twilioMessage.sendMessage(phoneNumber, scottMessage);

    }
}
