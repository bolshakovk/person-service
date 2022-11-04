package liga.medical.personservice.core.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserDto {
    private final Long id;
    private final String username;
    private final String password;
    private final Set<RoleDto> roles;
}
