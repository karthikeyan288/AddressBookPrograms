package com.AddressBooks;

public class Contacts {

	private String firstName;
	private String lastName;
	private String address;
	private String cityName;
	private String stateName;
	private String zipCode;
	private String phoneNumber;
	private String emailId;

	public Contacts(String firstName, String lastName, String address, String cityName, String stateName,
			String zipCode, String phoneNumber, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cityName = cityName;
		this.stateName = stateName;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return cityName;
	}

	public void setCity(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return stateName;
	}

	public void setState(String stateName) {
		this.stateName = stateName;
	}

	public String getZip() {
		return zipCode;
	}

	public void setZip(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return emailId;
	}

	public void setEmail(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Contact{" + "firstname= '" + firstName + '\'' + ", lastname='" + lastName + '\'' + ", address='" + address + '\''
				+ ", city='" + cityName + '\'' + ", state='" + stateName + '\'' + ", phone='" + phoneNumber + '\''
	}
}

