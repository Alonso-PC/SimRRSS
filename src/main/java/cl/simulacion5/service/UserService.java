package cl.simulacion5.service;

import java.util.List;

import cl.simulacion5.entity.User;

public interface UserService {

	void addUser (User user);
	User getUserById (int userid);
	List<User> getListUsers();
	void editUser (User user);
	void deleteUser(int userid);
}
