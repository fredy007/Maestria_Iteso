package com.PToH.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.objects.*;

import java.io.UnsupportedEncodingException;
import java.net.*;

import com.common.DbConnection;

@RestController
public class Users {
	
	@RequestMapping(value="Users/{FirstName}/{LastName}/{UserName}/{Password}/{Email}")
	public String greeting(@PathVariable String FirstName,
					       @PathVariable String LastName,
					       @PathVariable String UserName,
					       @PathVariable String Password,
					       @PathVariable String Email){
		
		User oUser = new User();
		
		
		try {
			
			oUser.setFirstName(URLDecoder.decode(FirstName,"UTF-8"));
			oUser.setLastName(URLDecoder.decode(LastName,"UTF-8"));
			oUser.setUserName(URLDecoder.decode(UserName,"UTF-8"));
			oUser.setPassword(URLDecoder.decode(Password,"UTF-8"));
			oUser.setEmail(URLDecoder.decode(Email,"UTF-8"));
			
			
		} catch (UnsupportedEncodingException e) {
			
			System.out.println(e.getMessage());
		
		}
		
		
		DbConnection conex= new DbConnection();
		
		conex.desconectar();
		
		return "Hello " + oUser.getFirstName() + " " + oUser.getLastName() + " " + oUser.getUserName() + " " + oUser.getPassword() ;
		
	}

}
