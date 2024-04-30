package nuclear.bot.core.repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "normal_value")
@NoArgsConstructor
public class NormalValueEntity {
    @Id
    @GeneratedValue
    private UUID id;

    @Setter
    @Getter
    @Column(name="parseragentname")
    private String parserAgentName;

    @Setter
    @Getter
    @Column(name="normalvalue")
    private String normalValue;
}
