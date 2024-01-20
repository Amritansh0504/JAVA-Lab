import java.util.Scanner;

public class Lab1b 
    {
        public static void main(String[] args) 
            {
                Scanner sc = new Scanner(System.in);
                int marks;
                
                System.out.print("Enter marks in chemistry(out of 100): ");
                marks = sc.nextInt();
                
                if(marks<40){
                    System.out.println("FAILED");
                }
                else if(marks>=40 && marks<50){
                    System.out.println("Grade: F- Just Passed");
                }
                else if(marks>=50 && marks<60){
                    System.out.println("Grade: E- Work Hard");
                }
                else if(marks>=60 && marks<70){
                    System.out.println("Grade: D- Satisfactory");
                }
                else if(marks>=70 && marks<80){
                    System.out.println("Grade: C- Good");
                }
                else if(marks>=80 && marks<90){
                    System.out.println("Grade: B- Very Good");
                }
                else if(marks>=90){
                    System.out.println("Grade: A- Excellent");
                }
                else{
                    System.out.println("Wrong Input!");
                }        
                sc.close();
            }
    }
