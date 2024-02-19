import java.util.Scanner;

interface employee{
    public void earnings(double basic);
    public void deductions(double basic);
    public void bonus(double basic);
}
abstract class Manager implements employee{
    @Override
    public void earnings(double basic){
        System.out.println("Earnings: " +(basic+ (0.80*basic)+ (0.15*basic)));
    }
    @Override
    public void deductions(double basic){
        System.out.println("Deduction Pf: "+ (0.12*basic));
    }
}
class substaff extends Manager{
    @Override
    public void bonus(double basic){
        System.out.println("Bonus: "+ (0.50*basic));
    }
}

public class Lab5c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary:");
        double b = sc.nextDouble();

        Manager m1 = new substaff();
        substaff s1 = new substaff();

        m1.earnings(b);
        m1.deductions(b);
        s1.bonus(b);
        sc.close();
    }
}
