package dbdemo.neo4j.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;
import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@JsonIdentityInfo(generator=JSOGGenerator.class)
@NodeEntity
@Data
public class Actor {
    @GraphId
    Long id;
    private String name;
    private int born;
}
