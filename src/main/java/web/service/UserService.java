package web.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.User;
import web.repository.UserRepository;

import java.util.List;


@Service
public class UserService {

    private final UserRepository userRepo;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void createUsersTable() {
        entityManager.createNativeQuery("CREATE TABLE IF NOT EXISTS users " +
                "(id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "lastName VARCHAR(50), " +
                "age TINYINT)").executeUpdate();
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUserById(long id) {
        return userRepo.findById(id).orElse(null);
    }

    public void saveUser(User user) {
        userRepo.save(user);
    }

    public void removeUserById(long id) {
        userRepo.deleteById(id);
    }

    public void dropUsersTable() {
        entityManager.createNativeQuery("DROP TABLE IF EXISTS users").executeUpdate();
    }

    public void cleanUsersTable() {

    }
}
