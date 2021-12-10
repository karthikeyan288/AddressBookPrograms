package com.AddressBooks;

import java.util.List;
import java.util.Scanner;
 
public class UserMain {
	public static void main(String[] args) {
		
		AddressBook ad = new AddressBook();
		//Sorting so =new Sorting();
		int i = 0;
		while (i == 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("********WELCOME TO ADDRESS BOOK********");
			System.out.print(	"Enter the choice 1-> add contact  2-> show Contact 3->edit Contact 4-> delete contact 5->Search  6->exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				ad.addContact();
				break;
			case 2:
				ad.ShowDetail();
				break;
			case 3:
				ad.editContact();
				break;
			case 4:
				ad.deleteRecord();
				break;
			case 5:
				ad.Search();
				break;
			case 6:
				System.out.println("*****THANKYOU*****");
				i = 1;
				break;
			default:
				break;
			}
		}
	}
}
