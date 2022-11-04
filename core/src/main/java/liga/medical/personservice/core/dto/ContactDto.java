package liga.medical.personservice.core.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ContactDto implements Serializable {
    private final long id;
    private final String phoneNumber;
    private final String email;
    private final String profileLink;
}
