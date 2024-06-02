package templates.Backup.serviceFiles;

import com.springProject.shooz.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Integer id);
    User saveUser(User user);
    void deleteUser(Integer id);
}
