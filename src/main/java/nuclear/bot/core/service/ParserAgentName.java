package nuclear.bot.core.service;

public enum ParserAgentName {
    UA_SITE("https://www.saveecobot.com/"),
    ROS_ATOM("https://www.russianatom.ru/"),
    MCHS("mchs not implemented");
    private String name;

    ParserAgentName(String agentName){
        this.name = agentName;
    }

    public String getAgentName(){
        return name;
    }
}
