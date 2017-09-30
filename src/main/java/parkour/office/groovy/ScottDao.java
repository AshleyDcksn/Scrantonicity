package parkour.office.groovy;

import org.springframework.web.client.RestTemplate;
import parkour.office.groovy.model.ScottMessage;

import java.net.HttpURLConnection;
import java.net.URL;


public class ScottDao {
    private URL url;
    private HttpURLConnection conn;
    private ScottMessage scottMessage;

    public ScottMessage getScottMessage(){
        RestTemplate restTemplate = new RestTemplate();
        scottMessage= restTemplate.getForObject("https://michael-scott-quotes.herokuapp.com/quote", ScottMessage.class);
        System.out.println(scottMessage.toString());
        return scottMessage;
    }
}
