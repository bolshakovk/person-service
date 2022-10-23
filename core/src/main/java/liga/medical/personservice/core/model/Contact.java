package liga.medical.personservice.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Contact {

  @Id
  private long id;
  private String phoneNumber;
  private String email;
  private String profileLink;


}
