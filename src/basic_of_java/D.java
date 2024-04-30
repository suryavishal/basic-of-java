package basic_of_java;

public class D {
public static void main(String[] args) {
	D.test();// it is mandatory to first call the method in main method then we are eligible to 
	// run any method either static or non static. 
	System.out.println(25);
}
	public static void test() { 
		System.out.println(100);
		
	}

}
