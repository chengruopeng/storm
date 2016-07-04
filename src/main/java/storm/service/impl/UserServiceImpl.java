package storm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import storm.IDao.UserMapper;
import storm.Model.User;
import storm.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	 private UserMapper userDao;  
	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);  
	}

}
