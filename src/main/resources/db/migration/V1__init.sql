CREATE TABLE AGENT_MESSAGE
(
    id              uuid PRIMARY KEY,
    parserAgentName VARCHAR(50)              NOT NULL,
    messageDateTime TIMESTAMP WITH TIME ZONE NOT NULL,
    message         VARCHAR(255)             NOT NULL
);
