package pl.kazik.ecommerce.hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController{
    @GetMapping("/hello-world")
    String helloWorldWhatever(){
        var name = "Kazik";

        return String.format("Hello %s", name);
    }
}