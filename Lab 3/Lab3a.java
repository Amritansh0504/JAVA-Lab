import java.util.Scanner;

class box{
    int vol(int l, int w, int h){
        int volume = l*w*h;
        return volume;
    } 
}
public class Lab3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        box b1= new box();
        System.out.print("Enter the length: ");
        int len= sc.nextInt();
        System.out.print("Enter the width: ");
        int wid= sc.nextInt();
        System.out.print("Enter the height: ");
        int height= sc.nextInt();
        
        System.out.println(b1.vol(len, wid, height));
        sc.close();
    }
}
