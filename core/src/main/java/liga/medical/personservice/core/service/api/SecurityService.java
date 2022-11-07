package liga.medical.personservice.core.service.api;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
