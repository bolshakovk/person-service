package liga.medical.personservice.core.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class PersonDataDto implements Serializable {
    private final long id;
    private final String lastName;
    private final String firstName;
    private final Date birthDt;
    private final long age;
    private final String sex;
    private final long parentId;
}
