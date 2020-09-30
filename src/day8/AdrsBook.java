package day8;

import java.util.ArrayList;
import java.util.Iterator;

public class AdrsBook
{
private ArrayList<Details> arrList = new ArrayList<Details>();
	
	public boolean addToAdrsBook(Details con) {
		//System.out.println("arrList.contains(con) : " + arrList.contains(con));
		if(getArrList().contains(con)) {
			System.out.println("Sorry! The details already exist...");
			return false;
		}
		getArrList().add(con);
		return true;
	}
	
	public void printArrayList() {
		System.out.println("Updated array list is: ");
		System.out.println(getArrList());
		//System.exit(0);
	}
	
	public void getDetailsAccCity(String cityOfPerson) {
		Iterator itr = arrList.iterator();
		int flag = 0;
		boolean flagIndex = false;
		while(itr.hasNext()) {
			Details c = (Details) itr.next();
			if(cityOfPerson.equals(c.getCity())){
				flagIndex = true;
				System.out.print("Here's detail #" + (flag+1) + " : ");
				System.out.println(arrList.get(flag));
				System.out.println();
			}
			flag++;
		}
		if(flagIndex == false) {
			System.out.println("Sorry! There's no detail regarding this city.");
		}
	}
	
	public void getDetailsAccState(String stateOfPerson) {
		Iterator itr1 = arrList.iterator();
		int flag1 = 0;
		boolean flagIndex1 = false;
		while(itr1.hasNext()) {
			Details c = (Details) itr1.next();
			if(stateOfPerson.equals(c.getState())){
				flagIndex1 = true;
				System.out.print("Here's detail #" + (flag1+1) + " : ");
				System.out.println(arrList.get(flag1));
				System.out.println();
			}
			flag1++;
		}
		if(flagIndex1 == false) {
			System.out.println("Sorry! There's no detail regarding this state.");
			System.out.println("Thank you for using the address book system. Do visit again!");
			System.exit(0);;
		}
		System.out.println("Thank you for using the address book system. Do visit again!");
		System.exit(0);
	}
	
	public ArrayList<Details> getArrList() {
		return arrList;
	}
	
	public int getArrListSize() {
		return arrList.size();
	}

	public void Details() {
		// TODO Auto-generated method stub
		
	}
		
	}
