/**
 * Created by Baker on 19.11.2015.
 */
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
public class TestController {

    @RequestMapping("/begun")
    public String map(){
        return "Duden.de";

    }

    public static void main(String[] args) throws Exception {

        SpringApplication.run(TestController.class, args);
    }
}





