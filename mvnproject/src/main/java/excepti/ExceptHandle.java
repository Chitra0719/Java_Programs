package excepti;

public class ExceptHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {	int a =5;
		int d = a/0;
		
		System.out.println(d);
	}
/*catch(ArithmeticException e)
	{
	
	System.out.println(e);
	}*/
	
	finally
	{
		
		System.out.println("FinalOut");
	}
	}

}
