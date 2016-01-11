package ms.service;

import java.util.List;

import ms.dao.UserDao;
import ms.model.User;

public class UserService {
	private UserDao userDao = new UserDao();
	public List<User> queryAllUser(){
		return userDao.queryAllUser();
		
	}
	public void add(User user){
		userDao.add(user);
	}
}
