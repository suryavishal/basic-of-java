package basic_of_java;

public class C {
	public static void main(String[] args) {
		C c1 = new C();
		c1.test();	// we have to call non static method with main method for run
	}
public  void test(){// non static method; like the non static variable,
	//the nosnstatic method not run untill we can't call it   
	//by creating a object and all.
	
	System.out.println(100);
}
}
