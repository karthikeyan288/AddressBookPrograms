package com.AddressBooks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.Trail.Person;

public class AddressBook {
	List<Contacts> addressBook = new ArrayList<Contacts>();
	Scanner sc = new Scanner(System.in);

	public void addContact() {
		final String firstName, lastName, address, cityName, stateName, zipCode, phoneNumber, emailId;
		System.out.print("Enter First Name : ");
		firstName = sc.nextLine();
		System.out.print("Enter Last Name : ");
		lastName = sc.nextLine();
		System.out.print("Enter Phone Number : ");
		phoneNumber = sc.nextLine();
		System.out.print("Enter Address : ");
		address = sc.nextLine();
		System.out.print("Enter city : ");
		cityName = sc.nextLine();
		System.out.print("Enter zip : ");
		zipCode = sc.nextLine();
		System.out.print("Enter state : ");
		stateName = sc.nextLine();
		System.out.println("Enter the Emailid :");
		emailId = sc.nextLine();
		addressBook.add(new Contacts(firstName, lastName, address, cityName, stateName, zipCode, phoneNumber, emailId));
	}

	public void ShowDetail() {
		for (Contacts contacts : addressBook) {
			System.out.println(contacts.getFirstName() + "\n" + "" + contacts.getLastName() + "\n"
					+ contacts.getAddress() + "\n" + contacts.getCity() + "\n" + contacts.getState() + "\n"
					+ contacts.getZip() + "\n" + contacts.getPhoneNumber() + "\n" + contacts.getEmail() + "\n");
		}
	}

	public void editContact() {
		int edit, i = 0;
		String firstName, lastName, address, cityName, stateName, zipCode, phoneNumber, emailId;
		for (Contacts contacts : addressBook) {
			System.out.println("Id :" + addressBook.indexOf(contacts));
		}
		System.out.println("Enter the Id to edit");
		int id = sc.nextInt();
		System.out.println(addressBook.get(id));
		while (i == 0) {
			System.out.println(
					"Enter the feild you want to edit 1: FirstName 2:Addrress  3:City  4:State  5:Phone  6:Zip Code 7: Exit");
			edit = sc.nextInt();
			switch (edit) {
			case 1:
				System.out.print("Enter new Name: ");
				firstName = sc.nextLine();
				addressBook.get(id).setFirstName(firstName);
				;
				break;
			case 2:
				System.out.print("Enter new Street : ");
				address = sc.nextLine();
				addressBook.get(id).setAddress(address);
				break;
			case 3:
				System.out.print("Enter new City : ");
				cityName = sc.nextLine();
				addressBook.get(id).setCity(cityName);
				break;
			case 4:
				System.out.print("Enter new State : ");
				stateName = sc.nextLine();
				addressBook.get(id).setState(stateName);
				break;
			case 5:
				System.out.print("Enter new Phone : ");
				phoneNumber = sc.nextLine();
				addressBook.get(id).setPhoneNumber(phoneNumber);
				break;
			case 6:
				System.out.print("Enter new Zip Code : ");
				zipCode = sc.nextLine();
				addressBook.get(id).setZip(zipCode);
				break;
			case 7:
				i = 1;
				break;
			default:
				System.out.println("Please Enter Valid Option");
			}
			System.out.println(addressBook.get(id));
		}
	}

	public void deleteRecord() {
		int id;
		for (Contacts contacts : addressBook) {
			System.out.println("Id: " + addressBook.indexOf(contacts) + " : " + contacts);
		}
		System.out.print("\nEnter #ID to delete Contact : ");
		id = sc.nextInt();
		addressBook.remove(id);
	}

	public boolean checkExists(String firstName) {
		int flag = 0;
		for (Contacts contacts : addressBook) {
			if (contacts.getFirstName().equals(firstName)) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			return true;
		}
		return false;
	}
}
