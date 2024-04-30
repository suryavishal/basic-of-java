package method_and_constructor;

public class B {
public static void main(String[] args) {
	B b1 = new B();
	b1.test(10,"hello",true,'z',10.3,10.3f);
}
public void test(int i,String s,boolean b,char c,double d,float f) {
System.out.println(i);	
System.out.println(s);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(f);
	
}// it is very much easy to gave any datatype value in method but it should be in same sequence and type sequence as well .

}
