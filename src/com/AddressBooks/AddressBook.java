package com.AddressBooks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddressBook implements IAddressBook {
	static List<Contacts> addressBook = new ArrayList<Contacts>();
	Scanner sc = new Scanner(System.in);

	public void addContact() {
		int i = 0;
		String firstName = null;
		final String lastName, address, cityName, stateName, zipCode, phoneNumber, emailId;
		while (i == 0) {
			System.out.println("Enter the first Name :");
			firstName = sc.nextLine();
			if (checkExists(firstName)) {
				System.out.println("The name is already present in the addressBook");
			} else {
				i = 1;
			}
		}
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
					"Enter the feild you want to edit 1: FirstName 2:Addrress  3:City  4:State  5:Phone  6:ZipCode 7: Exit");
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
				System.out.println("Back to Menu ");
        break;
			}
			System.out.println(addressBook.get(id));
		}
	}

	public static void searchByCity(List<Contacts> contacts) {
		String search;
		List<Contacts> addressBook = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name to search : ");
		search = sc.nextLine();
		int flag = 0;
		for (Contacts con : contacts) {
			if (con.getCity().equalsIgnoreCase(search)) {
				System.out.println(con.getPhoneNumber());
				flag = 1;
				addressBook.add(con);
			}
		}
		if (flag == 1) {
			System.out.println("...Match Found...");
			for (Contacts co : addressBook) {
				System.out.println(co);
			}
		} else {
			System.out.println("Match Not Found!!!");
		}
	}

	public static void searchByState(List<Contacts> contacts) {
		String search;
		List<Contacts> addressBook = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name to search : ");
		search = sc.nextLine();
		int flag = 0;
		for (Contacts con : contacts) {
			if (con.getCity().equalsIgnoreCase(search)) {
        System.out.println(con.getPhoneNumber());
				flag = 1;
				addressBook.add(con);
			}
		}
		if (flag == 1) {
			System.out.println("...Match Found...");
			for (Contacts co : addressBook) {
				System.out.println(co);
			}
		} else {
			System.out.println("Match Not Found!!!");
		}
	}

	public void Search() {
		int search;
		System.out.println("Enter to search  1-> search by city  2->Search by State ");
		search = sc.nextInt();
		switch (search) {
		case 1:
			searchByCity(addressBook);
			break;
		case 2:
			searchByState(addressBook);
			break;
		default:
        system.out.println("Back to Menu");
			break;
		}
	}

	public void deleteRecord() {
		int id;
		for (Contacts contacts : addressBook) {
			System.out.println("Id: " + addressBook.indexOf(contacts) + " : " + contacts);
		}
		System.out.print(" Enter ID to delete Contact : ");
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

	public void Sorting() {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice for sorting : 1.Sortbyname 2.SortbyCity 3.SortbyState 4.SortbyZip ");
		value = sc.nextInt();
		switch (value) {
		case 1:
			sortByFirstNmae();
			break;
    case 2:
			sortByCity();
			break;
		case 3:
			sortByState();
			break;
		case 4:
			sortByZip();
			break;
		default:
			System.out.println("Back to Menu");
			break;
		}
	}

	private void sortByFirstNmae() {
		List<Contacts> contacts = addressBook.stream()
				.sorted(Comparator.comparing(Contacts::getFirstName))
				.collect(Collectors.toList());
		System.out.println(contacts);
	}

	private void sortByCity() {
		List<Contacts> contacts = addressBook.stream()
				.sorted(Comparator.comparing(Contacts::getCity))
				.collect(Collectors.toList());
		System.out.println(contacts);
	}

	private void sortByState() {
		List<Contacts> contacts = addressBook.stream()
				.sorted(Comparator.comparing(Contacts::getState))
				.collect(Collectors.toList());
		System.out.println(contacts);
	}

	private void sortByZip() {
		List<Contacts> contacts = addressBook.stream()
				.sorted(Comparator.comparing(Contacts::getZip))
				.collect(Collectors.toList());
		System.out.println(contacts);
	}
}


