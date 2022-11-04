package liga.medical.personservice.core.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Data
public class IllnessDto implements Serializable {
    private final long id;
    private final long medicalCardId;
    private final long typeId;
    private final String heaviness;
    private final Timestamp appearanceDttm;
    private final Date recoveryDt;
}
