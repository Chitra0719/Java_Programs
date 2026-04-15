package inheritance;

public class ChildProgram extends ParentProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChildProgram o = new ChildProgram();
     o.test1(4);
     o.test(2);
	}
 public void test1(int b)
 {
	 System.out.println(b);
 }
}
