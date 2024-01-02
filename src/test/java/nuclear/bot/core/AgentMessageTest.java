package nuclear.bot.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import nuclear.bot.core.config.MessageAdapter;
import nuclear.bot.core.dto.AgentMessage;
import nuclear.bot.core.service.AgentMessageToEntityMapper;
import nuclear.bot.core.service.ParserAgentName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

@ExtendWith(SpringExtension.class)
public class AgentMessageTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void createDto() throws JsonProcessingException {
        AgentMessage agentMessage = new AgentMessage();
        agentMessage.setParserAgentName(ParserAgentName.UA_SITE.getAgentName());
        agentMessage.setMessage("Okey");
        agentMessage.setMessageDateTime(OffsetDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));

        var json = objectMapper.writeValueAsString(agentMessage);

        System.out.println(json);
    }

    @Test
    public void test1() throws Exception{
        var agentMessage = objectMapper.readValue(
                "{\"parserAgentName\":\"https://www.saveecobot.com/\",\"messageDateTime\":\"2023-12-06T12:39:11.206101Z\",\"message\":\"146\"}",
                AgentMessage.class);
        var mapper = new AgentMessageToEntityMapper();

        var result = mapper.map(agentMessage);

        System.out.println(result);
    }

    @Test
    public void test2() throws Exception{
        var agentMessage = objectMapper.readValue(
                "{\"parserAgentName\":\"don.ru/online-map/\",\"messageDateTime\":\"2023-12-06T12:38:58.210001300Z\",\"message\":\"0.11\"}",
                AgentMessage.class);
        var mapper = new AgentMessageToEntityMapper();

        var result = mapper.map(agentMessage);

        System.out.println(result);
    }

//    @Test
//    public void test3(){
//        var messageAdapter = new MessageAdapter();
//        messageAdapter.configure(new HashMap<>(), false);
//
//        var result = messageAdapter.deserialize(null, "{\"parserAgentName\":\"https://www.saveecobot.com/\",\"messageDateTime\":\"2023-12-06T12:39:11.206101Z\",\"message\":\"146\"}".getBytes());
//
//        System.out.println(result);
//    }
}
