package liga.medical.personservice.core.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "illness")
public class Illness {
    @Id
    private long id;

    private long medicalCardId;

    private long typeId;

    private String heaviness;

    private java.sql.Timestamp appearanceDttm;

    private java.sql.Date recoveryDt;
}
