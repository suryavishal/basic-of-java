package method_and_constructor;
//method type
public class A {
	public static void main(String[] args) {
		A a1 =new A();
		int x = a1.test();
	System.out.println(x);
	}
	
public int test() {	
//public void test() {// because the deff. itself call anything 
	//which didn't return any value this is called void 
	//return 100; //so it throws error when we used the return keyword in it.
 //  so we have to assign a data type class name by ctrl 1.
  return 100;
  //System.out.println(x);// if we write anything after the return keyword programmm throws error 
  // because after run return key it is goes to the calling statement in main.
}
}
