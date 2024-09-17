package com.salary.manager.service;
 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 


@Entity
public class Services {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String designationServices;
	private int userCreatedServices;
	private int userModifiedServices;
	private String dateCreatedServices;
	private String dateModifiedServices;
	
	
	public Services() {
		super();
	}


	public Services(Services services) {
		super();
		this.id = services.getId();
		this.designationServices = services.getDesignationServices();
		this.userCreatedServices = services.getUserCreatedServices();
		this.userModifiedServices = services.getUserModifiedServices();
		this.dateCreatedServices = services.getDateCreatedServices();
		this.dateModifiedServices = services.getDateModifiedServices(); 
	}


	public int getId() {
		return id;
	}
 

	public void setId(int id) {
		this.id = id;
	}


	public String getDesignationServices() {
		return designationServices;
	}


	public void setDesignationServices(String designationServices) {
		this.designationServices = designationServices;
	}


	public int getUserCreatedServices() {
		return userCreatedServices;
	}


	public void setUserCreatedServices(int userCreatedServices) {
		this.userCreatedServices = userCreatedServices;
	}


	public int getUserModifiedServices() {
		return userModifiedServices;
	}


	public void setUserModifiedServices(int userModifiedServices) {
		this.userModifiedServices = userModifiedServices;
	}


	public String getDateCreatedServices() {
		return dateCreatedServices;
	}


	public void setDateCreatedServices(String dateCreatedServices) {
		this.dateCreatedServices = dateCreatedServices;
	}


	public String getDateModifiedServices() {
		return dateModifiedServices;
	}


	public void setDateModifiedServices(String dateModifiedServices) {
		this.dateModifiedServices = dateModifiedServices;
	}

 
	
   
}
