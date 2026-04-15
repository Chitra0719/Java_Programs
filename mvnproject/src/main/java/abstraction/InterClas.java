package abstraction;

public class InterClas implements InterA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterClas obj = new InterClas();
		obj.test();
		System.out.println(obj.test1(7));
		System.out.println(obj.test2('j'));

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

	@Override
	public int test1(int a) {
		// TODO Auto-generated method stub
		return a;
	}
	
	public char test2(char c)
	{
		return c;
		
	}

}
