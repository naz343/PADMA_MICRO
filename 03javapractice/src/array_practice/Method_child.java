package array_practice;

public class Method_child {

	public static void main(String[] args) {
		// Syntex= parent class+ any object name = new parent class();We are creating
		//parent object in child class as we want to see parents code in child class

		Method1 AA = new Method1();
		//When AA. we can access to public and default attribute only, we don't see
		//private attribute as it can be accessed only from the same class.Console:4,2
		
		System.out.println(AA.a);
		System.out.println(AA.b);
		
		Method1 dd =new Method1();
		dd.alpha();
		dd.alpha3();
		
		
	}

}
