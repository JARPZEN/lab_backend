package backend.src.main.java.culturemedia.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/echo")
    public String echoMessage(@RequestBody String message) {
        return "Echo: " + message;
    }
}
