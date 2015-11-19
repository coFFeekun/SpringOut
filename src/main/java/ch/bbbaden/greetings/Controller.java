package ch.bbbaden.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@EnableAutoConfiguration
@SpringBootApplication
@EnableAsync
public class Controller {

    @RequestMapping("/begun")
    public String map(){

        return "animated.gif";

    }

    public static void main(String[] args) throws Exception {

        SpringApplication.run(Controller.class, args);
    }
}





