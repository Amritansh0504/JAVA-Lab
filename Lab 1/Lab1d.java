import java.util.Scanner;
public class Lab1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.print("Enter the no to check for palindrome: ");
        no = sc.nextInt();
        int no1 = no;
        int temp = 0;
        while(no != 0){
            temp = temp*10 + no%10;
            no = no/10;            
        }
        if(temp == no1){
            System.out.println("Palindrome sucessfully deleted");
        }
        else{
            System.out.println("The input no. is not a palindrome");
        }
        sc.close();
    }
    
}
