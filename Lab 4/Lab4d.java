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

        Person p[] = new Person[3]; 

        for(int i= 0; i<3; i++){
            p[i] = new Person();
            System.out.println("Enter the name for "+(i+1)+" user: ");
            p[i].name = sc.nextLine();
            System.out.print("Enter the Aadhar no for user 1: ");
            p[i].aadhar_no = sc.nextInt();
            System.out.print("Enter the Account number for user 1: ");
            int a= sc.nextInt();
            System.out.print("Enter the Balance for user 1: ");
            int b = sc.nextInt();
            p[i].input(a, b);
            sc.nextLine();
            System.out.println();
        }

        for(int i=0; i<3; i++){
            System.out.println("Details for user 1: ");
            p[i].disp();
            System.out.println();
        }
        
        sc.close();
    } 
}
