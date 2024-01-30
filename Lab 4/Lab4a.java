import java.util.Scanner;

class dimensions{
void d2(int side){
System.out.println("the cost of the box of side "+side+" is:" +(side*side*40)+ " rupees.");
}

void d3(int side){
    System.out.println("the cost of the box of side "+side+" is:" +(side*side*side*60)+ " rupees.");
}
}

public class Lab4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the 2d sheet metal box: ");
        int b1 = sc.nextInt();
        System.out.print("Enter the size of the 3d sheet box: ");
        int b2 = sc.nextInt();
        dimensions d1 = new dimensions();

        d1.d2(b1);
        d1.d3(b2);

        sc.close();
    }
}
