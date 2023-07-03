package com.exampale.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Atul2 {
	
	
	@GetMapping(value="/om")	
	public String name() {
		return "omkar Ghogare";
	}
	
	@GetMapping(value="/omkar")	
	public App user() {
		
		App userApp=new App(1,"omkar","omkarGHogare","OMkar@Gmail.com" );
		
		return userApp;
	}
	@GetMapping("/singer")
	public List getStList()
	{
		List list =new ArrayList();
		list.add("Ajay");
		list.add("atul");
		return list;
	}
	

}
