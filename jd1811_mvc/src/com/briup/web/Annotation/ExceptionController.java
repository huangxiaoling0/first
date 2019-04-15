package com.briup.web.Annotation;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController 
	{
	@RequestMapping("/err")
	public String err_test() throws IOException{
		//int i=10/0;
		int a=0;
		if(a==0){
			throw new IOException("io错误");
		}
		return "index";
	}
}







