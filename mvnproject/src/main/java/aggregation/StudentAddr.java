package aggregation;

public class StudentAddr {
          String Address;
          Student Ref;        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.test("Java", 30);
		StudentAddr ob = new StudentAddr("housename", obj);
		ob.display();

	}
		public StudentAddr(String Address, Student Ref)
		{
			this.Address= Address;
			this.Ref=Ref;			
					}
		public void display()
		{
			
			System.out.println(Address);
			System.out.println(Ref.name);
			System.out.println(Ref.r);
		}
	

}
