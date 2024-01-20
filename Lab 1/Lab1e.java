import java.util.Scanner;
public class Lab1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String First_Name;
        String Second_Name;
        System.out.print("Enter First Name: ");
        First_Name = sc.nextLine();
        System.out.print("Enter Last Name: ");
        Second_Name = sc.nextLine();

        System.out.println(Second_Name +" "+ First_Name);
        sc.close();
    }
}
