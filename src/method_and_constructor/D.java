package method_and_constructor;
// constructor overloading  
public class D {
D(){//here we can call more than one constructor but it have differnt argument/ or differnt type of argument
	System.out.println(1);
}
D(int x){
	System.out.println(x);
}
D(int x, int y ){
	System.out.println(x);
	System.out.println(y);
}
public static void main(String[] args) {
	D d1 = new D();
	D d2 = new D(2);
	D d3 = new D(3,4);
}
}
