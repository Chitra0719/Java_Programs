package multiinherit;

public class Childc implements ParentA, ParentB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childc o = new Childc();
		o.test1();
		o.test();
		System.out.println(o.test2(9));
	}
	@Override
	public void test1() {
		// TODO Auto-generated method stub
	  System.out.println("Hello A");	
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello B");
	}	
	public int test2(int a)
	{
		
		return a;
	}

}
