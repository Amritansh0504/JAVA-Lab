import java.util.Scanner;

public class Lab3e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int []roll = new int[n];  
        String []name = new String[n];
        double []cgpa = new double[n];
        int low=0;


        for(int i=0; i<n; i++){
            System.out.print("Enter the Roll number for the "+ (i+1) +" student: ");
            roll[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the name for the "+ (i+1) +" student: ");
            name[i] = sc.nextLine();
            System.out.print("Enter the CGPA for the "+ (i+1) +" student: ");
            cgpa[i] = sc.nextDouble();
            double temp = cgpa[0];
            if(cgpa[i] < temp){
                temp = cgpa[i];
                low = i;
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            System.out.println("Details of the " + (i+1) + " student: ");
            System.out.print("Name: " + name[i] + ", ");
            System.out.print("Roll number: " + roll[i] + ", ");
            System.out.print("CGPA: " + cgpa[i]);
            System.out.println("\n");
        }
        System.out.println("Student with the lowest cgpa: "+ name[low]);
        sc.close();
    }
}
