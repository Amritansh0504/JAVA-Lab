import java.util.Scanner;

public class Lab2c{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the " +(i+1)+" number: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: "); 
        for(int i=0; i<n; i++){
            System.out.println( arr[i]);
        }
        sc.close();
    }
}