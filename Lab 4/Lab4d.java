import java.util.Scanner;

class Account{
    int acc_no;
    int balance;

    void input(int a, int b){
        acc_no = a;
        balance = b;
    }
    void disp(){
        System.out.println("Account number: "+ acc_no);
        System.out.println("Account balance"+ balance);
    }
}

class Person extends Account{
    String name;
    int aadhar_no;

    void disp(){
        System.out.println("Name: "+ name);
        System.out.println("Aadhar number: "+ aadhar_no);
        System.out.println("Account number: "+ super.acc_no);
        System.out.println("Account balance: "+ super.balance);
    }
}

public class Lab4d {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        
        System.out.print("Enter the Name for user 1: ");
        p1.name = sc.nextLine();
        System.out.print("Enter the Aadhar no for user 1: ");
        p1.aadhar_no = sc.nextInt();
        System.out.print("Enter the Account number for user 1: ");
        int a= sc.nextInt();
        System.out.print("Enter the Balance for user 1: ");
        int b = sc.nextInt();
        p1.input(a, b);
        sc.nextLine();
        System.out.println();
        
        System.out.print("Enter the Name for user 2: ");
        p2.name = sc.nextLine();
        System.out.print("Enter the Aadhar no for user 2: ");
        p2.aadhar_no = sc.nextInt();
        System.out.print("Enter the Account number for user 2: ");
        a= sc.nextInt();
        System.out.print("Enter the Balance for user 2: ");
        b = sc.nextInt();
        p2.input(a, b);
        sc.nextLine();
        System.out.println();
        
        System.out.print("Enter the Name for user 3: ");
        p3.name = sc.nextLine();
        System.out.print("Enter the Aadhar no for user 3: ");
        p3.aadhar_no = sc.nextInt();
        System.out.print("Enter the Account number for user 3: ");
        a= sc.nextInt();
        System.out.print("Enter the Balance for user 3: ");
        b = sc.nextInt();
        p3.input(a, b);
        System.out.println();
        

        System.out.println("Details for user 1: ");
        p1.disp();
        System.out.println();

        System.out.println("Details for user 2: ");
        p2.disp();
        System.out.println();
        
        System.out.println("Details for user 3: ");
        p3.disp();
        System.out.println();
        
        sc.close();
    } 
}
