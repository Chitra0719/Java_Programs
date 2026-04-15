package empsalary;

public class TotalSalary extends GetSalaryinfo{
	double hra, pf;

    public void calculate() {
        hra = 0.05 * basicPay;   
        pf = 0.20 * basicPay;    
        
        System.out.println("hra:" + hra);
        System.out.println("pf:" + pf);
    }
}
