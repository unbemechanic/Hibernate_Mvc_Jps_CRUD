package web.repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

}
