package nuclear.bot.core.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "AGENT_MESSAGE")
@NoArgsConstructor
public class AgentMessageEntity {
    @Id
    @GeneratedValue
    @Getter
    private UUID id;

    @Setter
    @Getter
    @Column(name="parseragentname")
    private String parserAgentName;

    @Setter
    @Column(name="messagedatetime")
    private OffsetDateTime messageDateTime;

    @Setter
    @Column(name="message")
    private String message;
}
