package com.AddressBook.ext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	public String fname;
	public String lname;
	public String address;
	public String phonenumber;
	public String city;
	public String state;
	public String zip;
	public String emailId;

	public AddressBook(String fname, String lname, String address, String phonenumber, String city, String state,
			String zip, String emailId) {
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Name :");
		String fname =sc.nextLine();
		System.out.println("Enter the last Name :");
		String lname =sc.nextLine();
		System.out.println("Enter the Address :");
		String address =sc.nextLine();
		System.out.println("Enter the Phone Number:");
		String phno =sc.nextLine();
		System.out.println("Enter the City :");
		String city =sc.nextLine();
		System.out.println("Enter the State :");
		String state =sc.nextLine();
		System.out.println("Enter the zip :");
		String zip =sc.nextLine();
		System.out.println("Enter the Email Id :");
		String email=sc.nextLine();
		
		AddressBook addressbook = new AddressBook(fname, lname, address, phno, city, state, zip, email);
		
		//putting in array list 
		ArrayList adbook = new ArrayList();
		adbook.add(addressbook);
		
		//iterator used to see the arraylist
		Iterator itr = adbook.iterator();
		
		while (itr.hasNext()) {
			AddressBook bk = (AddressBook)itr.next();
			System.out.println(bk.fname+"\n"+bk.lname+"\n"+bk.address+"\n"+bk.phonenumber+"\n"
					+bk.city+"\n"+bk.state+"\n"+bk.zip+"\n"+bk.emailId);
		
	}
	}

}
