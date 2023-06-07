# Nuclear-bot-core
dto's and processing logic. Listen kafka PARSING.EVENT kafka topic


# Model
Use AgentMessage for send to this service messages like this

{
  "parserAgentName": "some name",
  "messageDateTime": "2023-01-01T15:00:15.000+03:00",
  "message": "hello World!"
}

# ( For build model from json scheme use command  gradle generateJsonSchema2Pojo )

kubectl port-forward kafka-broker-c856f4d9b-tcrcp 9092
docker build -t vladi15151/nuclear-bot-core:0.6 .  
docker push vladi15151/nuclear-bot-core:0.6   