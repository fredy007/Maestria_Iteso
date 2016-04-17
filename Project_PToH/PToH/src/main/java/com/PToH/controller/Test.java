package com.PToH.controller;

import com.common.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping(value="test/{name}")
	public String greeting(@PathVariable String name){
		
		
		DbConnection conex= new DbConnection();
		
		conex.desconectar();
		
		return "Hello " + name;
	}
}