package nuclear.bot.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import nuclear.bot.core.dto.AgentMessage;
import nuclear.bot.core.service.ParserAgentName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ExtendWith(SpringExtension.class)
public class AgentMessageTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void createDto() throws JsonProcessingException {
        AgentMessage agentMessage = new AgentMessage();
        agentMessage.setParserAgentName(ParserAgentName.UA_SITE.getAgentName());
        agentMessage.setMessage("Okey");
        agentMessage.setMessageDateTime(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));

        var json =  objectMapper.writeValueAsString(agentMessage);

        System.out.println(json);
    }
}
