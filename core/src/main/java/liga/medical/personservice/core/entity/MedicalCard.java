package liga.medical.personservice.core.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@Table(name = "medical_card")
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
  private Set<Illness> illness;
}
