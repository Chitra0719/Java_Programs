package aggregation;

public class AggB {
     int c;
     int d;
     AggA ref; //aggregation or entity reference
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AggA obj = new AggA();
     obj.test(5,6);
     AggB ob = new AggB( 8, 9, obj);
     ob.display();
	}
	public  AggB( int c, int d, AggA ref)
	{
		
		this.c =c;
		this.d =d;
		this.ref= ref;
		
	}
	
	public void display()
	{		
		System.out.println(c);
		System.out.println(d);
		System.out.println(ref.a);
		System.out.println(ref.b);
	}

}
