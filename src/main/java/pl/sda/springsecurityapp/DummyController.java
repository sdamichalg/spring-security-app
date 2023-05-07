package pl.sda.springsecurityapp;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/hello")
public class DummyController {

    @GetMapping
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello from my api!");
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/forAdmin")
    public ResponseEntity<String> helloWorldForAdmin() {
        return ResponseEntity.ok("Witaj adminie!");
    }

    @RolesAllowed("ROLE_USER")
    @GetMapping("/forUser")
    public ResponseEntity<String> helloWorldForUser() {
        return ResponseEntity.ok("Witaj użytkowniku!");
    }
}
