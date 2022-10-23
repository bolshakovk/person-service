package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Data
@EntityScan
public class Adress {

  @Id
  private long id;

  private long contactId;
  private long countryId;
  private String city;
  private long ind;
  private String street;
  private String building;
  private String flat;


}
