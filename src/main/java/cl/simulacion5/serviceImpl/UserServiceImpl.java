package cl.simulacion5.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.simulacion5.entity.User;
import cl.simulacion5.repository.UserRepository;
import cl.simulacion5.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User getUserById(int userid) {
		Optional<User> user = userRepository.findById(userid);
		return user.get();
	}

	@Override
	public List<User> getListUsers() {
		List<User> user = userRepository.findAll();
		return user;
	}

	@Override
	public void editUser(User user) {
		userRepository.save(user);
	}

	@Override
	public void deleteUser(int userid) {
		userRepository.deleteById(userid);
	}

}
