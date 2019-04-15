package com.briup.bean;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	@NotBlank
	@Size(max=6,min=4,
	message="名字长度必须是4～6个字符")
	private String name;
	@Max(30)
	@Min(15)
	private Integer age;
	@DateTimeFormat(pattern="yyyy-MM-dd")
//	@Future 需要和现在对比是
	//一个将来的时间
//	@Past 需要和现在对比是过去的时间
	private Date  dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	
}
