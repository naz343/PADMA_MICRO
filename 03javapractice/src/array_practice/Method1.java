package array_practice;

public class Method1 {
//We always create method and object after class and before main method.
	
	
// public access modifier,is universal means accessible from anywhere.	
public int a =4;
// default access modifier,can only be accessible from same class under same package
//and under same project.
 int b = 2;
 //private access modifier,can only accessible from the same class.
 private int c = 6;
 	
 public void alpha() {
	 System.out.println("This is public method");
 }
 private void alpha1() {
	 System.out.println("This is a private method");}
  void alpha3() {
	 System.out.println("this is a void method");
  }
	 
 
 

 
 
 
 
 
 public static void main(String[] args) {
		//In this case i can access to private attribut alon with other two attributes.
	    //Console: 4,2,6
	
	 Method1 bb =new Method1();
	 System.out.println(bb.a);
     System.out.println(bb.b);
     System.out.println(bb.c);
	}

}
