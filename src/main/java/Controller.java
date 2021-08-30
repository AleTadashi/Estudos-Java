import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")

public class Controller {

    @GetMapping ("/")
    public String greeting ()
    {
        return "Hello World";

    }

}