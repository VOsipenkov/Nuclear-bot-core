package nuclear.bot.core.service;

import nuclear.bot.core.dto.AgentMessage;
import nuclear.bot.core.repository.AgentMessageEntity;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class AgentMessageToEntityMapper {
    public AgentMessageEntity map(AgentMessage agentMessage) {
        var entity = new AgentMessageEntity();
        entity.setMessage(agentMessage.getMessage());
        entity.setMessageDateTime(OffsetDateTime.parse(agentMessage.getMessageDateTime()));
        entity.setParserAgentName(agentMessage.getParserAgentName());
        return entity;
    }
}
