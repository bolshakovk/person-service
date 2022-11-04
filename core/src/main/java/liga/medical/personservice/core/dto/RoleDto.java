package liga.medical.personservice.core.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class RoleDto implements Serializable {
    private final Long id;
    private final String name;
    private final Set<UserDto> users;
}
