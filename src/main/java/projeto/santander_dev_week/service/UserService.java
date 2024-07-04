package projeto.santander_dev_week.service;

import projeto.santander_dev_week.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
