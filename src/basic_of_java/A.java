package basic_of_java;
// non statics variable 
public class A {
	int x= 10;// because it create outside of the method but inside the class 
	//without refering the statics prior so called instant variable or non static variable. 
public static void main(String[] args) {// method 
	//System.out.println(x); error  means we cant call non static variable wthout creating a class. 
	 A a1 = new A();
	 System.out.println(a1.x);
}
}
