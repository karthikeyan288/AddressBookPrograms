package com.AddressBook.ext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	int addressbook = 0;
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
		addressbook++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Name :");
		String fname = sc.nextLine();
		System.out.println("Enter the last Name :");
		String lname = sc.nextLine();
		System.out.println("Enter the Address :");
		String address = sc.nextLine();
		System.out.println("Enter the Phone Number:");
		String phno = sc.nextLine();
		System.out.println("Enter the City :");
		String city = sc.nextLine();
		System.out.println("Enter the State :");
		String state = sc.nextLine();
		System.out.println("Enter the zip :");
		String zip = sc.nextLine();
		System.out.println("Enter the Email Id :");
		String email = sc.nextLine();

		AddressBook addressbook = new AddressBook(fname, lname, address, phno, city, state, zip, email);

		// putting in array list
		ArrayList<AddressBook> adbook = new ArrayList<AddressBook>();
		adbook.add(addressbook);

		// iterator used to see the arraylist
		Iterator itr = adbook.iterator();

		while (itr.hasNext()) {
			AddressBook bk = (AddressBook) itr.next();
			System.out.println(bk.fname + "\n" + bk.lname + "\n" + bk.address + "\n" + bk.phonenumber + "\n" + bk.city
					+ "\n" + bk.state + "\n" + bk.zip + "\n" + bk.emailId);

		}

		System.out.println("Enter the contact Name to edit:");
		String name = sc.nextLine();
		for (AddressBook adb : adbook) {
			if (adb.fname.equals(name)) {
				System.out.println("   ");
				System.out.println("Edit the contact details");
				Scanner sc1 = new Scanner(System.in);
				System.out.print("First Name:");
				String fname1 = sc.nextLine();
				System.out.print("Last Name:");
				String lname1 = sc.nextLine();
				System.out.print("Enter Address:");
				String address1 = sc.nextLine();
				System.out.print("Enter phone number:");
				String phno1 = sc.nextLine();
				System.out.print("Enter City:");
				String city1 = sc.nextLine();
				System.out.print("Enter State:");
				String state1 = sc.nextLine();
				System.out.print("Enter Zip:");
				String zip1 = sc.nextLine();
				System.out.print("Enter email id:");
				String email1 = sc.nextLine();
				AddressBook addressbook1 = new AddressBook(fname1, lname1, address1, phno1, city1, state1, zip1,
						email1);

				adbook.set(0, addressbook1);

			}
			System.out.println("\nEdited contact details\n");
			while (itr.hasNext()) {
				AddressBook bk = (AddressBook) itr.next();
				System.out.println(bk.fname + "\n" + bk.lname + "\n" + bk.address + "\n" + bk.phonenumber + "\n"
						+ bk.city + "\n" + bk.state + "\n" + bk.zip + "\n" + bk.emailId);

			}
		}

	}

}