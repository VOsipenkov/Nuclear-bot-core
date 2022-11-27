# Nuclear-bot-parsing-processor
Processor for parsing clients with json schemas and dto


# Messaging
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