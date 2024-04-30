package method_and_constructor;
// constructor /it is parmanently vod and never return any value 
public class C {
	C(){// it must be start with same as class name only 
 //return 100; it is void so it cant be return a value .
		}
public static void main(String[] args) {
	C c1 = new C();// constructor always call as many time we create an object  
	C c2 = new C();// here constructor call two tme because two object are create
}
}