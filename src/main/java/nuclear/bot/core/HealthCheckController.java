package nuclear.bot.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Value("${application.name}")
    private String name;

    @GetMapping(value = "core/health")
    public String healthCheck() {
        return "Core health ok\n";
    }

    @GetMapping(value = "/core/config")
    public String configCheck() {
        return name + "\n";
    }
}
