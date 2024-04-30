package nuclear.bot.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AgentMessageRepository extends JpaRepository<AgentMessageEntity, UUID> {
    List<AgentMessageEntity> findAllByParserAgentNameOrderByMessageDateTimeDesc(String agentName);

    @Query(value = "select * from agent_message am where parseragentname = :agentName"
            + " order by messagedatetime desc"
            + " fetch first 1000 rows only", nativeQuery = true)
    List<AgentMessageEntity> getFreshMessages(String agentName);
}
