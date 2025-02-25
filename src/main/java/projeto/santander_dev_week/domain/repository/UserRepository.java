package projeto.santander_dev_week.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto.santander_dev_week.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
