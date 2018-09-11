package oop;

public class Demo {

	public static void main(String[] args) {
		//Person
		
		//Attributes
		String name = "Joe";
		String email = "joe@deo.com";
		String phone = "005987836";
		
		//Actions, activity
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		//What if want to add a another person
		
		//Attributes
		String name2 = "Sarah";
		String email2 = "sarah@deo.com";
		String phone2 = "009887656";
		
		//Actions, activity
		//System.out.println(name2 + " is walking");
	    walking(name2);
		System.out.println(name2 + " is eating");
	}
		//Enhance by adding functions
		static void walking(String name) { 
		System.out.println(name + " is walking");
		}
}
