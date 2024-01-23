import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;
    int area;
    int perimeter;
    void read(int len ,int b){
        breadth= b;
        length= len;
    }
    void calculate(){
        area =  (length*breadth);
        perimeter = 2*(length+breadth);
    }

    void display(){
        System.out.println("Area of rectangle: "+area);
        System.out.println("Perimeter of rectangle: "+perimeter);
    }
    
}


public class Lab3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        System.out.print("enter the length for first rectangle: ");
        int l1= sc.nextInt();
        System.out.print("enter the breadth for first rectangle: ");
        int b1= sc.nextInt();
        r1.read(l1,b1);
        r1.calculate();
        r1.display();
        
        System.out.print("enter the length for second rectangle: ");
        int l2= sc.nextInt();
        System.out.print("enter the breadth for second rectangle: ");
        int b2= sc.nextInt();
        r2.read(l2,b2);
        r2.calculate();
        r2.display();

        sc.close();
    }
}
