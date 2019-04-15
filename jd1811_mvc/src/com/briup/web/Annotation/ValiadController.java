package com.briup.web.Annotation;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.briup.bean.Student;

@Controller
public class ValiadController {
	/*
	 * 构建一个Student 并且
	 * requst.setAttribute("student",Student)
	 */
	@ModelAttribute("student")
	public Student getStudent(){
		return new Student();
	}
	@RequestMapping(value="/vald",
			method=RequestMethod.GET)
	public String valiad(
				@ModelAttribute("student") 
				Student student){
		return "valiad";
	}
	@RequestMapping(value="/vald",
			method=RequestMethod.POST)
	//student=Student(xx,xx,xx)
	public String valiad1(@Valid Student stu,
			BindingResult result){
		//BindingResult result存储不合法提示信息用的
		if(result.hasErrors()){
			List<ObjectError> errors=
					result.getAllErrors();
			for(ObjectError or:errors){
				System.out.println(or.getDefaultMessage());
			}
			return "valiad";
		}
		return "index";
	}
}
