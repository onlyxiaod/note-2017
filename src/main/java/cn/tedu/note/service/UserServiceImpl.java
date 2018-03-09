package cn.tedu.note.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.tedu.note.dao.UserDao;
import cn.tedu.note.entity.NoteResult;
import cn.tedu.note.entity.User;

@Service("userService")//扫描Service组件
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	@Transactional
	public NoteResult checkLogin(String name, String pwd) {
		NoteResult result = new NoteResult();
		User user = userDao.findByName(name);
		if (user == null) {
			result.setStatus(1);
			result.setMsg("用户名不存在");
			return result;
		}
		if (!user.getCn_user_password().equals(pwd)) {
			result.setStatus(2);
			result.setMsg("密码不正确");
			return result;
		}
		result.setStatus(0);
		result.setMsg("用户名和密码正确");
		return result;
		
	}

}
