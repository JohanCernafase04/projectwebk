package com.ManageBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Usuario;
import com.util.JPAUtil;


@ManagedBean(name="index")
@SessionScoped
public class SessionManageBean implements Serializable{
	
	private String username;
	private String password;
	private String result;
	private List<Usuario> listaUsuarios= new ArrayList<>();
	
	
	
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}



	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getResult() {
		return result;
	}



	public void setResult(String result) {
		this.result = result;
	}



	public String loginCheck(){
		
    
	if(getUsername().equalsIgnoreCase("Johan") && getPassword().equalsIgnoreCase("Cerna"))
	
	{
		EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
		Query query=entity.createQuery("SELECT u FROM Usuario u");
		setListaUsuarios(query.getResultList());
		return "Menu.xmhtl";
	} else
	
	{
		return "Login.xmhtl";
	}

	}
	
}
