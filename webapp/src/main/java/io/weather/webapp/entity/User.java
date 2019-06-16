package io.weather.webapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * This class is the main model or </br>
 * entity of the class.
 * 
 * @author christian
 *
 */
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long uid;
	private String firstname;
	private String lastname;
	private String email;
	private long phoneNumber;

	/**
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phoneNumber
	 */
	public User(String firstname, String lastname, String email, long phoneNumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	/**
	 * 
	 * @return the user id of the User entity
	 */
	public long getUid() {
		return uid;
	}

	/**
	 * Setter of user id for the User Entity
	 * 
	 * @param uid
	 */
	public void setUid(long uid) {
		this.uid = uid;
	}

	/**
	 * 
	 * @return the firstname of the User entity
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Setter of user firstname for the User Entity
	 * 
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * 
	 * @return the lastname of the user entity
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Setter of user lastname for the User Entity
	 * 
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * 
	 * @return the email of the User Entity
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter of user email for the User Entity
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return the user phone number of the user </br>
	 *         entity
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Setter of user phone number for the User Entity
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
