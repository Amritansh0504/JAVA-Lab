import java.util.Scanner;

class rectangle{
    int length;
    int breadth;
    rectangle(){
        length=0;
        breadth=0;
    }
    rectangle(int length, int breadth){
        int area = length*breadth;
         System.err.println("Area of the rectangle: "+ area);
    }    
}

public class Lab3f {
    @SuppressWarnings("unused")
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    int len = scan.nextInt();
    System.out.print("Enter the breadth of the rectangle: ");
    int bth = scan.nextInt();
    
    rectangle r1 = new rectangle();
    rectangle r2 = new rectangle(len, bth);

    scan.close();
}
}
