package abstraction;

public class AbstractC extends AbstractP{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractC obj = new AbstractC();
		obj.test();
		obj.test1();
		obj.test2();

	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("ChildA");
		
	}
	public void test2()
	{
		
		System.out.println("TestData");
	}

}
