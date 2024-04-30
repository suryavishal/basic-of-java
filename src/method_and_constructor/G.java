package method_and_constructor;
//constructor chaining - calling of one constructor by another constructor
public class G {
G(){
	System.out.println(100);
}
G(int x){
this();
}
public static void main(String[] args) {
	G g1 = new G();
}
}