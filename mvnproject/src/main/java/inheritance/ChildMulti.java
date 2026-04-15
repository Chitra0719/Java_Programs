package inheritance;

public class ChildMulti extends ParentMulti{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChildMulti obj = new ChildMulti();
     obj.test();
	}
 public void test()
 {  super.test();
	System.out.println("Hi,Child"); 
	 
 }
}
