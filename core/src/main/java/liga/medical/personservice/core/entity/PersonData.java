package liga.medical.personservice.core.entity;

import liga.medical.personservice.core.entity.Contact;
import liga.medical.personservice.core.entity.MedicalCard;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "person_data")
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
