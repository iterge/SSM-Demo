package com.lph.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lph.dao.TeacherMapper;
import com.lph.entities.Teacher;

@Controller
@RequestMapping("/test")
public class TestController {
	@Resource
	private Teacher teacher;
	@Resource
	private TeacherMapper tm;
	
	@RequestMapping("/getTeacher")
	@ResponseBody
	public Teacher getList(){
		teacher = tm.selectByPrimaryKey("1");
		return teacher;
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String index(){
		return "Hello World!";
	}
}
