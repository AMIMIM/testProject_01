package com.adrian.project01.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class PersonForm {
	
	@NotBlank
	@Size(min=2, max=30)
	private String name;
	
	@NotNull
	@Min(18)
	private Integer age;

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String toString() {
		return "Person name: "+ this.name +" /n/tAge: " + this.age;
	}
}
