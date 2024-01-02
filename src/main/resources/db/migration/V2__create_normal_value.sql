create table normal_value
(
    id              uuid DEFAULT gen_random_uuid() PRIMARY KEY,
    parserAgentName VARCHAR(50) UNIQUE NOT NULL,
    normalValue     double precision   NOT NULL
);