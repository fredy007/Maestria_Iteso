package com.objects;

public class User {
	
	private String UserName;
	private String Password;
	private String FirstName;
	private String LastName;
	private String Email;
	private boolean isValidated;
	

	public User() {
		
		super();
		this.UserName 	 = "";
		this.Password 	 = "";
		this.FirstName   = "";
		this.LastName    = "";
		this.Email 	     = "";
		this.isValidated = false;
	}


	public User(String userName, String password, String firstName, String lastName, String email,boolean isValidated) {
		
		super();
		this.UserName 	 = userName;
		this.Password 	 = password;
		this.FirstName   = firstName;
		this.LastName    = lastName;
		this.Email 	     = email;
		this.isValidated = isValidated;
	}
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public boolean isValidated() {
		return isValidated;
	}
	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}
	

}
