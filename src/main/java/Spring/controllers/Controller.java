package Spring.controllers;

import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/get")
    public Map<String, Object> getMessage(Authentication authentication) {
        return Map.of("message", "test",
                "username", authentication.getName(),
                "authorities", authentication.getAuthorities());
    }
}