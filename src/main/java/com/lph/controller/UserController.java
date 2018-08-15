package com.lph.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.n3r.idworker.Sid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lph.entities.User;
import com.lph.service.UserService;

@Controller
// @RequestMapping("/user")
public class UserController {
	@Resource
	private User user;
	@Resource
	private UserService us;
	@RequestMapping("/getUser")
	@ResponseBody
	public User getUser(){
		String id = "1";
		user = us.getUserById(id);
		return user;
	}
	@RequestMapping("/get")
	public ModelAndView get(){
		ModelAndView mav = new ModelAndView();
		String id = "1";
		user = us.getUserById(id);
		mav.setViewName("list");
		mav.addObject("message", "haha");
		mav.addObject("user", user);
		List<User> l = new ArrayList<User>();
		l.add(user);
		mav.addObject("list",l);
		// List
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c++");
		list.add("oracle");
		mav.addObject("bookList", list);
		return mav;
	}
	@RequestMapping("/insert")
	//@ResponseBody
	public String insertUser(HttpServletRequest request){
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		//user.setId(UUID.randomUUID().toString());
		user.setId(Sid.nextShort());
		user.setName(name);
		user.setPwd(pwd);
		String str = "";
		int n = us.insertUser(user);
		if(n == 1){
			str = "success";
		}else{
			str = "error";
		}
		return str;
	}
	@RequestMapping("/update")
	//@ResponseBody
	public String updateUser(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("pwd") String pwd){
		System.out.println(name+"  "+pwd);
		user.setId(id);
		user.setName(name);
		user.setPwd(pwd);
		int str = us.updateUser(user);
		if(str == 1){
			return "redirect:/get";
		}
		return "error";
	}
	@RequestMapping("/delete")
	@ResponseBody
	public int deleteUser(){
		String id = "92298a25-8bd5-4b01-9a18-3f059f7c7235";
		int str = us.deleteUser(id);
		return str;
	}
	@RequestMapping("/list")
	public ModelAndView getList(){
		List<User> list = us.userList();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");
		mav.addObject("list",list);
		return mav;
	}
	@RequestMapping("/userList")
	@ResponseBody
	public Map<String, Object> getList1(){
		List<User> list = new ArrayList<User>();
		list = us.userList();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", 11);
		map.put("data", list);
		return map;
	}
	@RequestMapping("/getList")
	@ResponseBody
	public Map<String, Object> getListUser(@RequestParam(required = false,defaultValue="1") int page,
			@RequestParam(required = false,defaultValue="10") int limit){
		PageHelper.startPage(page, limit);
		List<User> list = new ArrayList<User>();
		list = us.userList();
		PageInfo<User> users = new PageInfo<User>(list);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("code", 0);
		map.put("msg", "");
		map.put("count", users.getTotal());
		map.put("data", users.getList());
		return map;
	}
}
