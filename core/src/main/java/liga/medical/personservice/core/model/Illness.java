package liga.medical.personservice.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Illness {

  @Id
  private long id;
  private long type_id;
  private String heaviness;
  private java.sql.Timestamp appearanceDttm;
  private java.sql.Date recoveryDt;
  private long medicalCardId;
}
