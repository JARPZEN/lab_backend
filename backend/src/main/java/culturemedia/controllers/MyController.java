package backend.src.main.java.culturemedia.controllers;
import backend.src.main.java.culturemedia.model.repository.RecordVideo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/videos")
public class MyController {

    @PostMapping
    public ResponseEntity<RecordVideo> addVideo(@RequestBody RecordVideo video) {
        // lógica para agregar un video
        return ResponseEntity.ok(video);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/echo")
    public String echoMessage(@RequestBody String message) {
        return "Echo: " + message;
    }

}
