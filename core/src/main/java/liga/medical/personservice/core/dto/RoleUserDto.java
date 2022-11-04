package liga.medical.personservice.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class RoleUserDto {
    private Long userId;
    private Long roleId;
}
