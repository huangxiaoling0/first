package com.briup.web.Annotation;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.briup.bean.Student;

@Controller
public class RegisterController {
	@RequestMapping("/regist")
	public String register(Student stu){
		System.out.println(stu);
		return "index";
	}
	/*
	 * 类型转化使用
	 * String ->Date
	 * 2018-8-17 ->java.util.Date
	 */
//	@InitBinder
//	public void test(WebDataBinder binder){
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
//		//true表示允许为空
//		binder.registerCustomEditor(
//				Date.class, new CustomDateEditor(dateFormat, true));  
//	}
}
