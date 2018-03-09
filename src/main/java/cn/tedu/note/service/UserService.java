package cn.tedu.note.service;

import cn.tedu.note.entity.NoteResult;

public interface UserService {
	public NoteResult checkLogin(String name,String pwd);
	
}
