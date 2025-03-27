truncate table normal_value;
alter table normal_value add parserAgentUrl VARCHAR(100) UNIQUE NOT NULL;

insert into normal_value(id, parseragentname, normalvalue, parserAgentUrl)
values (gen_random_uuid(), 'www.saveecobot.com', 150, 'https://www.saveecobot.com/');

insert into normal_value(id, parseragentname, normalvalue, parserAgentUrl)
values (gen_random_uuid(), 'don.ru', 40, 'don.ru/online-map/');