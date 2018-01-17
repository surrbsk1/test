package com.stackroute.activitystream.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
/*
 * The class "Circle" will be acting as the data model for the circle Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 * 
 * Please note that you will have to use @Component annotation on this class if wish
 * to autowire the class from any other components of the application
 */
public class Circle {
	/*
	 * This class should have three fields
	 * (circleName,creatorId,createdDate). Out of these three fields, the
	 * field circleName should be the primary key. This class should also contain
	 * the getters and setters for the fields. The value of createdDate should
	 * not be accepted from the user but should be always initialized with the
	 * system date
	 */
	
	
	
	public Circle(String string, String string2, Timestamp timestamp) {
		// TODO Auto-generated constructor stub
	}
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public void setCircleName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setCreatedDate() {
		// TODO Auto-generated method stub
		
	}
	public void setCreatorId(String string) {
		// TODO Auto-generated method stub
		
	}
	public String getCircleName() {
		// TODO Auto-generated method stub
		return null;
	}	
}