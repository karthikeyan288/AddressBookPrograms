package com.AddressBook.ext;

public class AddressBook {
	public String fname;
	public String lname;
	public String address;
	public String phonenumber;
	public String city;
	public String state;
	public String zip;
	public String emailId;

	public AddressBook(String fname, String lname, String address, String phonenumber, String city, String state, String zip,
			String emailId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phonenumber = phonenumber;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.emailId = emailId;
	}

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook("Ram", "gobal", "kottar 12/94A", "5466336", "chennai", "tamil Nadu",
				"698544", "ram321@gmail.com");
		System.out.println(addressBook.fname + " " + addressBook.lname);
		System.out.println(addressBook.address + " " + addressBook.phonenumber);
		System.out.println(addressBook.city + " " + addressBook.state);
		System.out.println(addressBook.zip + " " + addressBook.emailId);
	}


}
