package day8;

import java.util.Scanner;

public class AddressBookUC7 
{
public static Address_Book ab = new Address_Book();
	
	public static void main(String[] args) {
		AddressBookUC7 u = new AddressBookUC7();
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.print("enter total no of new entry ");
		count = sc.nextInt();
		for(int i=0; i<count; i++) {
			System.out.println("specify their details " + (i+1));
			u.Details();	
		}
	}

	private static void Details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		String firstName = sc.nextLine();
		
		System.out.println("Enter last name:");
		String lastName = sc.nextLine();
		
		System.out.println("Enter address:");
		String address = sc.nextLine();
		
		System.out.println("Enter city:");
		String city = sc.nextLine();	
		
		System.out.println("Enter state:");
		String state = sc.nextLine();
		
		System.out.println("Enter zip:");
		long zip = sc.nextLong();
		
		System.out.println("Enter 10 digit phone number");
		long phoneNumber = sc.nextLong();

		sc.nextLine();
		
		System.out.println("Enter email-Id:");
		String emailId = sc.nextLine();
		
		Contacts c = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, emailId);
		
		System.out.println("Thank you! processing");
		
		try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}

		ab.addToAddressBook(c);
		ab.printArrayList();				
	}
}
