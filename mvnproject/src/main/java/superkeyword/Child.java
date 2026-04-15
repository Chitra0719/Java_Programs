package superkeyword;

public class Child extends Parent{
     int a =8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Child s = new Child();
      s.test();
	}
	
	public void test()
	{
		
		System.out.println(a);
		System.out.println(super.a);
	}

	
}
