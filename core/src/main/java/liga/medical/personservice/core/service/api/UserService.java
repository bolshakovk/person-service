package liga.medical.personservice.core.service.api;

import liga.medical.personservice.core.entity.User;
import liga.medical.personservice.core.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService{
    void save(User user);

    User findByUsername(String username);
}
