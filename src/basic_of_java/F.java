  package basic_of_java;

public class F {
static F f1;// it is called global reference variable we can use it anywhere in my programme
public static void main(String[] args) {// the default value of global reference variable is null
	f1=new F();
	System.out.println(f1);
			f1.test();
			
}
   public void test() {
	System.out.println(f1);
}
}
