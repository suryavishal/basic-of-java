package basic_of_java;
//static variable 
public class B {
	static int z=200; 
 public static void main(String[] args) {
	System.out.println(B.z);// we can access these variable by class name only because
	//it get store in the metaspace i.e the specfied space which is called common memoryor class memory .   
	B.z=25;
	System.out.println(B.z);
// we can easily change the static varible upon call by the class name also    
 
 }
 
}
