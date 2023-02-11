package nuclear.bot.core.service.impl;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import lombok.extern.slf4j.Slf4j;
import nuclear.bot.core.dto.AgentMessage;
import nuclear.bot.core.service.AlertLevel;
import nuclear.bot.core.service.MessageRpcService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AutoJsonRpcServiceImpl
public class MessageRpcServiceImpl implements MessageRpcService {

    @Value("${notification.level}")
    private AlertLevel notificationLevel;

    @Override
    public AgentMessage sendMessage(AgentMessage agentMessage) {
        log.info("[INPUT]{}", agentMessage);
        return agentMessage;
    }

    @Override
    public AlertLevel notificationLevel() {
        return notificationLevel;
    }
}
