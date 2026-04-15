package excepti;

public class MultiExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a[] = new int[3];
			a[4] = 7/0;
			
		}
		catch(ArrayIndexOutOfBoundsException r)
		{
			
			System.out.println("ArrayEXcept");
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
