package liga.medical.personservice.core.mapper;

import liga.medical.personservice.core.dto.RoleUserDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleUserMapper {

    void addRoleUser(RoleUserDto roleUserDto);
}
