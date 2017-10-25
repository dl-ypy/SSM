package com.ypy.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ypy.model.UserModel;
import com.ypy.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserAction {
	@Autowired
	private IUserService userService;
	
	/**
	 * 查询
	 * @param map
	 * @return
	 */
	@RequestMapping("/query.do")
	public String query(Map<String, Object> map) {
		List<UserModel> list = userService.querySelective(null);
		map.put("list", list);
		return "/user.jsp";
	}
	
	/**
	 * 添加
	 * @param user
	 * @return
	 */
	@RequestMapping("/save.do")
	public String save(UserModel user) {
		userService.insertSelective(user);
		return "redirect:query.do";
	}
	
	@RequestMapping("/queryone.do")
	public String queryOne(Integer userid, Map<String, UserModel> map) {
		UserModel user = userService.selectByPrimaryKey(userid);
		map.put("user", user);
		return "/update.jsp";
	}
	
	/**
	 * 修改
	 * @param user
	 * @return
	 */
	@RequestMapping("/update.do")
	public String update(UserModel user) {
		userService.updateByPrimaryKeySelective(user);
		return "redirect:query.do";
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete.do")
	public String delete(Integer userid) {
		int i = userService.deleteByPrimaryKey(userid);
		return "redirect:query.do";
	}
}
