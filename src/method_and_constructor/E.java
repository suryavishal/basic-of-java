package method_and_constructor;
//never use void or datatype while creatring a constructor ,
//if we done it,then its convernt into method not a constructor 
public class E {
	E() { //void E() or int E{
		System.out.println(100);
	}
public static void main(String[] args) {
	E e1 = new E();
}
}
