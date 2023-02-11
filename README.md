# Nuclear-bot-core
dto's and processing logic. Listen kafka PARSING.EVENT kafka topic


# Model
Use AgentMessage for send to this service messages like this

{
  "id": "1",
  "jsonrpc": "2.0",
  "method": "sendMessage",
  "params": {
    "agentMessage": {
      "parsingAgentName": "parsingAgentName",
      "messageDateTime": "27-11-2022'T'09:14:37.123+07:00",
      "message": "message"
    }
  }
}

# ( For build model from json scheme use command  gradle generateJsonSchema2Pojo )
 