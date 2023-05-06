package nuclear.bot.core.service;

import lombok.extern.slf4j.Slf4j;
import nuclear.bot.core.dto.AgentMessage;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AgentMessageService {
    @KafkaListener(topics = "#{topic}")
    public void read(AgentMessage agentMessage) {
        log.info("Read message {}", agentMessage);
    }
}
