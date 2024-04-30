package basic_of_java;
//variable type
public class E {
public static void main(String[] args) {
	E.test();
	//System.out.println(x); we got error here because it is local variable of what? method test 
	// so we didnot call it another method because its throws an error 
	// it is mandatory to intilised the local variable before using it.
	//eg.....int x;Error
}// wgen er put the varible before main and make static so it is global variable we can used it anywhwere in programm
public static void test() {
	int x =101;
	System.out.println(x); 
}

}
