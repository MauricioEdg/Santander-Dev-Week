package projeto.santander_dev_week.service.imp;

import org.springframework.stereotype.Service;
import projeto.santander_dev_week.domain.model.User;
import projeto.santander_dev_week.domain.repository.UserRepository;
import projeto.santander_dev_week.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("this user id already exists");
        }
        return userRepository.save(userToCreate);
    }
}
