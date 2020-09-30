package day8;

import java.util.Scanner;

public class AddressBookUC8
{
public static AdrsBook ab = new AdrsBook();
	
	public static void main(String[] args) {
		
		AdrsBook u = new AdrsBook();
		
		Scanner sc = new Scanner(System.in);
		
		int count;
		System.out.print("Enter the count of person you want to add details of: ");
		count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			System.out.println("Enter the details as specified below for person " + (i+1));
			u.Details(); 
		}
		
		ab.printArrayList();
		
		if(ab.getArrListSize()!=0) 
		{
			System.out.println("Enter the name of the city to find complete details: ");
			sc.nextLine();
			String cityName = sc.nextLine();
			ab.getDetailsAccCity(cityName);
		}
		else 
		{
			System.out.println("Please enter atleast one person details to extract info...");
			u.Details();
			System.out.println("Enter the name of the city to find complete details: ");
			sc.nextLine();
			String cityName = sc.nextLine();
			ab.getDetailsAccCity(cityName);
		}
		
		System.out.println("Enter the name of the state to find complete details: ");
		String stateName = sc.nextLine();
		ab.getDetailsAccState(stateName);
		
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
		
		System.out.println("Enter 10 digit phone number without country code:");
		long phoneNumber = sc.nextLong();

		sc.nextLine();
		
		System.out.println("Enter email-Id:");
		String emailId = sc.nextLine();
		
		Details c = new Details(firstName, lastName, address, city, state, zip, phoneNumber, emailId);
		
		System.out.println("Please wait.....");
		
		try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}

		boolean index = ab.addToAdrsBook(c);
		if(index == false) {
			System.out.println("Please enter correct details.");
			Details();
		}
		System.out.println("Thank you! The details have been added successfully!");
	}
}
