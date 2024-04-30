package method_and_constructor;
//non static method by this keyword
public class J {
	public static void main(String[] args) {
		
	J j1 = new J();
	j1.test2();
	}

public void test1() {
	this.test2();
}
public void test2() {
System.out.println(500);
}
}