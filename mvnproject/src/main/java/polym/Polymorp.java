package polym;

public class Polymorp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Polymorp i = new Polymorp();
    i.test(5);
    i.test();
    i.test(1, 'c');
	}
	
	public void test(int a)
	{
		
		System.out.println(a);
	}
	public void test()
	{
		
		System.out.println("Hello");
	}
	public void test(int a, char b)
	{
		
		System.out.println(a +" " + b);
	}

}
