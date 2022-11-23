package nuclear.bot.parsingprocessor.service;

import com.googlecode.jsonrpc4j.JsonRpcMethod;
import com.googlecode.jsonrpc4j.JsonRpcParam;
import com.googlecode.jsonrpc4j.JsonRpcService;
import main.java.nuclear.bot.parsingprocessor.ParserMessage;

@JsonRpcService("/jsonrpc")
public interface MessageRpcService {
    ParserMessage sendMessage(@JsonRpcParam(value = "message") ParserMessage parserMessage);
}
