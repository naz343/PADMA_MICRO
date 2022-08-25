package array_practice;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args)  {
		
		//It stores data in key/value pair.
		//Syntax: HashMap<Integer.String>Fruits = new HashMap<Integer,String>():
               // HashMap<String,String>Student = new HashMap<Integer,String>():
               // HashMap<String,Integer>Fruits = new HashMap<Integer,String>():
				
	try{HashMap<Integer,String>Fruits = new HashMap<Integer,String>();
		Fruits.put(1,"Mango"); 
		Fruits.put(2,"Apple"); 
		Fruits.put(3,"Orange");
		Fruits.put(4,"Cherry");
		
		//To print all data. console:{1=Mango, 2=Apple, 3=Orange, 4=Cherry}
		System.out.println(Fruits);
		
		//To print single data we use get method.Console: Apple
				Fruits.get(5);
				System.out.println(Fruits.get(5));
	}
	catch(Exception e) {System.out.println("abcd");}
		
	
		//HashMap<String,String>Student = new HashMap<Integer,String>();
		//Console:{Fl=Orlando, NY=Albany, California=Sacramento, Arizona=Poenix}
	
				
		HashMap<String,String>citystate =new HashMap<String,String>();
		
		citystate.put("Fl","Orlando");
		citystate.put("NY","Albany" );
		citystate.put("California","Sacramento");
		citystate.put("Arizona","Poenix");
		
		//System.out.println(citystate);
		////Retrive sigle city by using get method.Console:Orlando.
		
		System.out.println(citystate.get("California"));
				//Retrive sigle city by using get method.
		
		}
		 
		
		}		
		
		
			
	


	


