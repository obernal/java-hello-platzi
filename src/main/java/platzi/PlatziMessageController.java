package platzi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlatziMessageController {

    @RequestMapping("/mensaje")
    public Message message() {
        return new Message("Hello Platzi!");
    }
}
