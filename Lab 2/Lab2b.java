import java.util.Scanner;

public class Lab2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];
        int nums[] = new int[10];
        try{
            for(int i=0; i<10; i++){
                System.out.print("enter the "+ (i+1)+" number: ");
                arr[i] = sc.next();
            }
            for(int i=0; i<10;i++){
                nums[i]= Integer.parseInt(arr[i]);
            }
            
        }catch(Exception e){
            System.out.println("Enter valid integer inputs!");
            sc.close();
            return;
        }
        System.out.println();
        int even=0;
        int odd=0;
        System.out.print("Even nos: ");
        for(int i=0; i<10; i++){
            if(nums[i] % 2 == 0){
                even++;
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("no. of even nos present: " + even);  
        System.out.print("Odd nos: ");
        for(int i=0; i<10; i++){
            if(nums[i] % 2 != 0){
                odd++;
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println();
        System.out.println("no. of odd nos present: " + odd);  
        sc.close();
    }
}

