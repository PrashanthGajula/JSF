package com.jsf.bean;

public class LoginBean {

	private String name;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String validate(){
		if(name.equals("hari") && password.equals("hari")){
			return "success";
		}else{
			return "failure";
		}
		
	}

}
