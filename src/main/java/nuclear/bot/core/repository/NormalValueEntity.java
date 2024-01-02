package nuclear.bot.core.repository;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "normal_value")
@NoArgsConstructor
public class NormalValueEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Setter
    @Column(name="parseragentname")
    private String parserAgentName;

    @Setter
    @Column(name="normalvalue")
    private String normalValue;
}
