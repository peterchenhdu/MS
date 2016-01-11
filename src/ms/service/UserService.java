package ms.service;

import java.util.List;

import ms.dao.UserDao;
import ms.model.User;

public class UserService {
	private UserDao userDao = new UserDao();
	public List<User> queryAllUser() throws Exception{
		return userDao.queryAllUser();
		
	}
	public void add(User user) throws Exception{
		userDao.add(user);
	}
}
