package com.autoplat.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.autoplat.model.Student;

@RestController
@RequestMapping(value="/autoplant")
public class ApRestContriller {

	@RequestMapping(value="/menu",method=RequestMethod.GET)
	public String showData(){
		
		return "SUCCESS";
	}
	
	
	@RequestMapping(value="/menu",method=RequestMethod.POST)
	public String getData(@RequestBody Student student){
		System.out.println(student.toString());
		
		
		return "GOT OBJECT";
	}
}
