package liga.medical.personservice.core.mapper;

import liga.medical.personservice.core.dto.UserDto;
import liga.medical.personservice.core.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(UserDto userDto);

    List<UserDto> toDtoList(List<User> user);

    List<User> toEntityList(List<UserDto> userDto);
}
