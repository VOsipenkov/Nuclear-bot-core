package nuclear.bot.core.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import nuclear.bot.core.repository.AgentMessageEntity;
import nuclear.bot.core.repository.AgentMessageRepository;
import nuclear.bot.core.repository.NormalValueEntity;
import nuclear.bot.core.repository.NormalValueRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class AgentMessageCleanerService {

    private final AgentMessageRepository agentMessageRepository;
    private final NormalValueRepository normalValueRepository;
    private final String scheduleTime;

    @Scheduled(fixedRateString = "#{scheduleTime}")
    public void cleanOldMessages() {
        log.info("Start clean messages job with scheduleTime {}", scheduleTime);
        var agentNames = normalValueRepository.findAll().stream()
                .map(NormalValueEntity::getParserAgentName)
                .collect(Collectors.toList());
        agentNames.stream().flatMap(agentName -> agentMessageRepository.getFreshMessages(agentName).stream())
                .collect(Collectors.toList()).stream()
                .collect(Collectors.toMap(AgentMessageEntity::getParserAgentName, AgentMessageEntity::getId));
        log.info("Duplicates removed");
    }
}
