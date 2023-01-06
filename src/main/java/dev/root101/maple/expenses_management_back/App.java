package dev.root101.maple.expenses_management_back;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    @Bean
    public ObjectMapper om() {
        ObjectMapper om = new ObjectMapper();
        //om.setSerializationInclusion(Include.NON_NULL);
        return om;
    }

    public static void main(String[] args) throws Exception {
        /*System.setProperty("http.proxyHost", "127.0.0.1");
        System.setProperty("http.proxyPort", "3129");
        System.setProperty("https.proxyHost", "127.0.0.1");
        System.setProperty("https.proxyPort", "3129");*/

        SpringApplication.run(App.class, args);

    }

}
