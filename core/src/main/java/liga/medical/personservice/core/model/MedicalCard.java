package liga.medical.personservice.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@Entity
public class MedicalCard {

  @Id
  private long id;

  private java.sql.Date registry_dt;
  private String clientStatus;
  private String medStatus;
  private String comment;

  @OneToOne
  private PersonData personData;

  @OneToMany
  private List<Illness> illness;
}
