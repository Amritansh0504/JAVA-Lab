import java.util.Scanner;
public class Lab2e{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 9 elements of the matrix: ");
        int arr[][]= new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        int left_diagonal=0;
        int right_diagonal=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j){
                    left_diagonal += arr[i][j]; 
                }
                if(i+j == 2){
                    right_diagonal += arr[i][j];
                }
            }
        }
        System.out.println("Sum of left diagonal: "+left_diagonal);
        System.out.println("Sum of right diagonal: "+right_diagonal);
        sc.close();
    }
}