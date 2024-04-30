package method_and_constructor;
//by using this keyword we can call the non static member( variable and method) also
public class I {
	int x=10;
	public static void main(String[] args) {
		I i1 =new I();
		System.out.println(i1.x);
		i1.test();
	}
public void test() {
	System.out.println(this.x);
}
}
