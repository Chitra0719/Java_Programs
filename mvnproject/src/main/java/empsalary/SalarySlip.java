package empsalary;

public class SalarySlip extends TotalSalary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalarySlip obj = new SalarySlip();

        obj.getInput(25000, 1500, 4000);
        obj.calculate(); 
        obj.generateSlip();  
        }
	public void generateSlip() {
        double total = basicPay + hra - pf - deduction + bonus;

        System.out.println("----- Salary Slip -----");
        System.out.println("Basic Pay   : " + basicPay);
        System.out.println("Deduction   : " + deduction);
        System.out.println("HRA (5%)    : " + hra);
        System.out.println("PF (20%)    : " + pf);
        System.out.println("Bonus       : " + bonus);
        System.out.println("Total Salary: " + total);
    }

}
