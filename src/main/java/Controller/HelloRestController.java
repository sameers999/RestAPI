package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }
    @GetMapping("/mr")
    public String SayHello(@RequestParam String name) {
        return "Hello"+name+"Form BridgeLabz";
    }
}
