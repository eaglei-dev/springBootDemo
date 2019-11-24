package com.example.demo;
// what would happen is @Component declared here.
public class EmailUser {
	
	String email;
	String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmailUser [email=" + email + ", password=" + password + "]";
	}
	public EmailUser(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	

}
