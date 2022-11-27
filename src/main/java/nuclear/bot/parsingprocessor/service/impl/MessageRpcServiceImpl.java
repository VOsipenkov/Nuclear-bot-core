package nuclear.bot.parsingprocessor.service.impl;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import lombok.extern.slf4j.Slf4j;
import nuclear.bot.parsingprocessor.dto.AgentMessage;
import nuclear.bot.parsingprocessor.service.MessageRpcService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AutoJsonRpcServiceImpl
public class MessageRpcServiceImpl implements MessageRpcService {

    @Override
    public AgentMessage sendMessage(AgentMessage agentMessage) {
        log.info("[INPUT]{}", agentMessage);
        return agentMessage;
    }
}
