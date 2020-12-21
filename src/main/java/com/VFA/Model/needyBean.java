package com.VFA.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class needyBean {

	@Id
	@Column(name = "needy-id")
	private Long id;
	
	@Column(name = "first-name")
	private String firstName;
	
	@Column(name = "last-name")
	private String lastName;
	
	@Column(name = "email-id")
	private String emailId;
	
	@Column(name = "gender")
	private String Gender;
	
	@Column(name = "phone-number")
	private Long phoneNo;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "adhaar-no")
	private Long adhaarCardNo;
	
	@Column(name = "disability")
	private String disability;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getAdhaarCardNo() {
		return adhaarCardNo;
	}

	public void setAdhaarCardNo(Long adhaarCardNo) {
		this.adhaarCardNo = adhaarCardNo;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	public needyBean(Long id, String firstName, String lastName, String emailId, String gender, Long phoneNo,
			String address, String city, String state, Long adhaarCardNo, String disability) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		Gender = gender;
		this.phoneNo = phoneNo;
		this.address = address;
		this.city = city;
		this.state = state;
		this.adhaarCardNo = adhaarCardNo;
		this.disability = disability;
	}

	public needyBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "needyBean [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", Gender=" + Gender + ", phoneNo=" + phoneNo + ", address=" + address + ", city=" + city + ", state="
				+ state + ", adhaarCardNo=" + adhaarCardNo + ", disability=" + disability + "]";
	}
	
	
	
}
