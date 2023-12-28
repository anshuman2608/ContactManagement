package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contacts {
	
	
	private String Name;
	private String address;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PhoneNumber;
	private String email;
	
	public Contacts() {
		
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Contacts(String name, String address, Integer phoneNumber, String email) {
		super();
		Name = name;
		this.address = address;
		PhoneNumber = phoneNumber;
		this.email = email;
	}
	

}
