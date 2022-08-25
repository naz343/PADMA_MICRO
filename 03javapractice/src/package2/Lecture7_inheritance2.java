package package2;

import array_practice.Lecture7_inheritance;

public class Lecture7_inheritance2 extends Lecture7_inheritance{

	public static void main(String[] args) {
		// Access from parent class to child class under diffenent package.
		//It didnot call protected data,it can only be called from parent class.

		Lecture7_inheritance2 xxx = new Lecture7_inheritance2();
		xxx.google_signin();
		xxx.googleinbox();
		xxx.googlesignup();
		
		
	}

}
