package nuclear.bot.parsingprocessor.service.impl;

import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;
import lombok.extern.slf4j.Slf4j;
import main.java.nuclear.bot.parsingprocessor.ParserMessage;
import nuclear.bot.parsingprocessor.service.MessageRpcService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AutoJsonRpcServiceImpl
public class MessageRpcServiceImpl implements MessageRpcService {

    @Override
    public ParserMessage sendMessage(ParserMessage message) {
        log.info("[INPUT]{}", message);
        return message;
    }
}
