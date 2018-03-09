package cn.tedu.note.dao;

import cn.tedu.note.entity.User;

public interface UserDao {
	public User findByName(String name);
}
