package pl.sda.springsecurityapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DummyController {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello from my api!");
    }

    @GetMapping("/forAdmin")
    public ResponseEntity<String> helloWorldForAdmin() {
        return ResponseEntity.ok("Witaj adminie!");
    }

    @GetMapping("/forUser")
    public ResponseEntity<String> helloWorldForUser() {
        return ResponseEntity.ok("Witaj użytkowniku!");
    }
}
