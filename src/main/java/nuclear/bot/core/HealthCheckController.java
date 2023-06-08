package nuclear.bot.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @GetMapping(value = "core/health")
    public String healthCheck(){
        return "Core health ok";
    }
}
