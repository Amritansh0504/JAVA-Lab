import java.util.Scanner;

public class Lab2a {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        try{
            String a1 = sc.next();
            String a2 = sc.next();
            String a3 = sc.next();

            int no1 = Integer.parseInt(a1);
            int no2 = Integer.parseInt(a2);
            int no3 = Integer.parseInt(a3);

            if(no1>no2 && no1>no3){
                System.out.println("The largest number among the input integers is: "+ no1);
            }
            else if(no2>no1 && no2>no3){
                System.out.println("The largest number among the input integers is: "+ no2);
            }
            else if(no3>no2 && no3>no1){
                System.out.println("The largest number among the input integers is: "+ no3);
            }
        }catch(Exception e){
            System.out.println("Enter valid integer inputs!");
        }
        sc.close();
    }    
}
