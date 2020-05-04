package com.ManageBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="menu")
@SessionScoped
public class UserManageBean implements Serializable{

	
	
	public String createUser(){
		
		return "CreateUser.xhtml";
	}
	
}
