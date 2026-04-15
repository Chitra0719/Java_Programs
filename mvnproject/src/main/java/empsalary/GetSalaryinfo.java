/*2. Program to find the total salary by hand of an Employee
• Class 1
Get basic pay, deduction and bonus from console.
• Class 2
Calculate hra (5% of basic pay) and pf (20% of basic pay).
• Class 3
Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip
• Salary slip should contains:- basic pay, deduction, hra, pf,
bonus and total salary by hand.
*/
package empsalary;

public class GetSalaryinfo {
    double basicPay, deduction, bonus;

    public void getInput(double basicPay, double deduction, double bonus) {
        this.basicPay = basicPay;
        this.deduction = deduction;
        this.bonus = bonus;
        
        System.out.println("basicPay :" + basicPay);
        System.out.println("deduction:" + deduction );
        System.out.println("bonus:" + bonus );
    }
}
