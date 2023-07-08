package nuclear.bot.core.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nuclear.bot.core.dto.AgentMessage;
import nuclear.bot.core.repository.Client;
import nuclear.bot.core.repository.ClientRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AgentMessageService {
    private final ClientRepository userRepository;

    @KafkaListener(topics = "#{topic}")
    public void read(AgentMessage agentMessage) {
        log.info("Read message {}", agentMessage);
        Client user = new Client();
        user.setAge("23");
        user.setName("Vlad");
        userRepository.save(user);
    }
}
