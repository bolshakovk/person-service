package liga.medical.personservice.core.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "contact")
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String phoneNumber;
  private String email;
  private String profileLink;


}
