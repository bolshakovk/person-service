package liga.medical.personservice.core.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Data
@Entity
public class PersonData {

  @Id
  private long id;
  private String lastName;
  private String firstName;
  private java.sql.Date birthDt;
  private long age;
  private String sex;
  private long parentId;


  @OneToMany
  private List<Contact> contactId;

  @OneToOne
  private MedicalCard medicalCard;

  @OneToMany
  private List<Contact> contacts;


}
