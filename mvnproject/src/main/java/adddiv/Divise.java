package adddiv;

public class Divise extends AddDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divise obj = new Divise();
		obj.div(17,20);

	}
  public void div(int x, int y)
  { 
	  int r = super.Add(x,y);
  
  System.out.println(r);
	  
  if (r % 10 == 0) {
      System.out.println("The result is divisible by 10.");
  } 
  else {
      System.out.println("The result is NOT divisible by 10.");
  }
  }
}
  

