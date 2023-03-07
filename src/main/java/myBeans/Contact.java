package myBeans;

import java.io.Serializable;

public class Contact implements Serializable{

	private static final long serialVersionUID = 1L;
	private String avatar;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public Contact(String avatar, String firstName, String lastName, String email, String phone) {
		super();
		this.avatar = avatar;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public Contact() {
		
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
