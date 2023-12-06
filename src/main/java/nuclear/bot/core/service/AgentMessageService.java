package nuclear.bot.core.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nuclear.bot.core.dto.AgentMessage;
import nuclear.bot.core.repository.AgentMessageRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AgentMessageService {
    private final AgentMessageRepository agentMessageRepository;
    private final AgentMessageToEntityMapper mapper;

    @KafkaListener(topics = "#{topic}")
    public void read(AgentMessage agentMessage) {
        log.info("Read message {}", agentMessage);
        var agentMessageEntity = mapper.map(agentMessage);
        agentMessageRepository.save(agentMessageEntity);
    }
}
