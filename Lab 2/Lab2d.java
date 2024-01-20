import java.util.Scanner;
public class Lab2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean occ[] = new boolean[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the " +(i+1)+" number: ");
            arr[i] = sc.nextInt();
            occ[i] = false; 
        }
        int cnt=1;
        for(int i=0; i<n; i++){
            if(occ[i]==true){
                    continue;
                }
                else if(occ[i]==false){
                    cnt=1;
                    for(int j=i+1; j<n; j++){
                    if(arr[i]==arr[j]){
                        cnt++;
                        occ[j]=true;
                    }
                }
            }
            System.out.println("element: "+arr[i]+" | "+ "occurances: "+cnt);
        }
        sc.close();
    }
}