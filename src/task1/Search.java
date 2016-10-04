package task1;

import java.util.ArrayList;
import java.util.HashMap;

public interface Search {

	static void SearchID(int id, ArrayList<Person> person){
		HashMap hmId2Ln = new HashMap();
		for(Person i : person){
			hmId2Ln.put(i.getIdNumber(), i.getLastName());
		}
		HashMap hmId2Fn = new HashMap();
		for(Person i : person){
			hmId2Fn.put(i.getIdNumber(), i.getFirstName());
		}
		HashMap hmId2Pn = new HashMap();
		for(Person i : person){
			hmId2Pn.put(i.getIdNumber(), i.getPhoneNumber());
		}

		System.out.println(id + " " + hmId2Fn.get(1234) + " " + hmId2Ln.get(1234) + " " + hmId2Pn.get(1234));
	}

	static void SearchLastName(String lastName, ArrayList<Person> person){
		HashMap hmLn2Id = new HashMap();
		for(Person i : person){
			hmLn2Id.put(i.getLastName(), i.getIdNumber());
		}
		HashMap hmLn2Fn = new HashMap();
		for(Person i : person){
			hmLn2Fn.put(i.getLastName(), i.getFirstName());
		}
		HashMap hmLn2Pn = new HashMap();
		for(Person i : person){
			hmLn2Pn.put(i.getLastName(), i.getPhoneNumber());
		}
		
		System.out.println(hmLn2Id.get(lastName) + " " + hmLn2Fn.get(lastName) + " " + lastName + " " + hmLn2Pn.get(lastName));
		
	}

	static void SearchFirstName(String firstName, ArrayList<Person> person){
		HashMap hmFn2Id = new HashMap();
		for(Person i : person){
			hmFn2Id.put(i.getFirstName(), i.getIdNumber());
		}
		HashMap hmFn2Ln = new HashMap();
		for(Person i : person){
			hmFn2Ln.put(i.getFirstName(), i.getLastName());
		}
		HashMap hmFn2Pn = new HashMap();
		for(Person i : person){
			hmFn2Pn.put(i.getFirstName(), i.getPhoneNumber());
		}
		System.out.println(hmFn2Id.get(firstName) + " " + firstName + " " + hmFn2Ln.get(firstName)  + " " + hmFn2Pn.get(firstName));
	}
	
	
	
	
	static void SearchPhoneNumber(String phoneNumber, ArrayList<Person> person){
		HashMap hmPn2Id = new HashMap();
		for(Person i : person){
			hmPn2Id.put(i.getPhoneNumber(), i.getIdNumber());
		}
		HashMap hmPn2Fn = new HashMap();
		for(Person i : person){
			hmPn2Fn.put(i.getPhoneNumber(), i.getFirstName());
		}
		HashMap hmPn2Ln = new HashMap();
		for(Person i : person){
			hmPn2Ln.put(i.getPhoneNumber(), i.getLastName());
		}
		System.out.println(hmPn2Id.get(phoneNumber) + " " + hmPn2Fn.get(phoneNumber) + " " + hmPn2Ln.get(phoneNumber)+ " " + phoneNumber);
	}
}
