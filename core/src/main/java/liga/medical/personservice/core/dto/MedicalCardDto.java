package liga.medical.personservice.core.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Data
public class MedicalCardDto implements Serializable {
    private final long id;
    private final Date registry_dt;
    private final String clientStatus;
    private final String medStatus;
    private final String comment;
    private final PersonDataDto personData;
    //private final Set<IllnessDto> illness;
}
