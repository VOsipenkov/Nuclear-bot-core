package nuclear.bot.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class SchedulerConfig {

    @Value("${application.scheduleTime:700000}")
    private String time;

    @Bean
    public String scheduleTime() {
        return time;
    }
}
