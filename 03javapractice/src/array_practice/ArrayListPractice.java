package array_practice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		// Syntax: ArrayList<String>fruits = new ArrayList<String>();
		
		ArrayList<String>Fruits = new ArrayList<String>();
		
		Fruits.add("Mango");
		Fruits.add("Orange");
		Fruits.add("Peach");
		Fruits.add("Guava");
		
		//Print all data's . Console:[Mango, Orange, Peach, Guava] 
		
		System.out.println(Fruits);
		 
		//Print single data we use get method where we choose the index for related data.Console: Peach
		System.out.println(Fruits.get(2));
		
		//For adding data we use add method. console:[Mango, Orange, Peach, Guava, Apple]

		Fruits.add("Apple");
		System.out.println(Fruits);
		
		//Find out is Strawberry exits in data, answer is in console:false
		Fruits.contains("Straberry");
		System.out.println(Fruits.contains("Straberry"));
		
				
		
		
		
		
	}

}
