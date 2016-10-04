package task1;

import java.util.*;

public class RunTasks1{

	public static void main(String[] args){
		ArrayList<Person> person = new ArrayList<>();
		person.add(new Person("Ender","Wiggin",1122,"555-1111"));
		person.add(new Person("Maria","Macarena",7788,"555-2222"));
		person.add(new Person("Harry","Potter",9955,"555-3333"));
		person.add(new Person("Honor","Harrington",8888,"555-4444"));
		person.add(new Person("Daneel","Olivaw",5555,"555-5555"));
		person.add(new Person("Peter","Parker",1234,"555-6666"));
		

		Search.SearchLastName("Macarena", person);
		Search.SearchLastName("Potter", person);
		Search.SearchID(1234, person);
/*
		Search.SearchID(1234, person);
		Search.SearchLastName("Parker", person);
		Search.SearchFirstName("Peter", person);
		Search.SearchPhoneNumber("555-6666", person);
*/
	}
}
