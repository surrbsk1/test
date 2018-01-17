package com.stackroute.activitystream.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * The class "User" will be acting as the data model for the user Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 *
 * Please note that you will have to use @Component annotation on this class if wish
 * to autowire the class from any other components of the application
 */
public class User {
	/*
	 * This class should have three fields
	 * (username,name,password). Out of these three fields, the
	 * field username should be the primary key. This class should also contain
	 * the getters and setters for the fields.
	 */
	
	public User(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setUsername(String string) {
		// TODO Auto-generated method stub
		
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	
}