package cn.tedu.note.dao.test;

import cn.tedu.note.dao.UserDao;
import cn.tedu.note.entity.User;

public class TestUserDao extends TestBase {
	public static void main(String[] args) {
		UserDao userDao = getContext().getBean("userDao", UserDao.class);
		User user = userDao.findByName("demo1");
		if (user == null) {
			System.out.println("用户名不正确");
		} else {
			System.out.println(user.getCn_user_password());
		}
	}

}
