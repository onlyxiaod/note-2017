package cn.tedu.note.controller.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.note.entity.NoteResult;
import cn.tedu.note.service.UserService;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/login.do")
	@ResponseBody//将返回值NoteResult转成json输出
	public NoteResult execute(String name,String pwd){
		NoteResult result = userService.checkLogin(name, pwd);
		return result;
	}
	
}
