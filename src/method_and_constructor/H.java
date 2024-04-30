package method_and_constructor;

public class H {
	public static void main(String[] args) {
		H h1 = new H();
	System.out.println(h1);// means this keyword are work as special refernce variable 
	//beacause h1 and this are print same address as in same object also 
	h1.test();
	
	}
public void test() {
System.out.println(this);
}
}
