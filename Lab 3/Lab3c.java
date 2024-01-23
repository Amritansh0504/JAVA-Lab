import java.util.Scanner;

class area{
    int area1(int side){
        return (side*side);
    }
    double area1(double radius){
        return(3.14*radius*radius);
    }
    double area1(double base, double height){
        return(0.5*base*height);
    }
}

public class Lab3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for area of square");
        System.out.println("OR");
        System.out.println("Enter 2 for area of circle");
        System.out.println("OR");
        System.out.println("Enter 3 for area of triangle");
        
        int choice = sc.nextInt();
        area a1 = new area(); 
        if(choice==1){
            System.out.print("Enter the side of the square: ");
            int side = sc.nextInt();
            System.out.println("Area of square: " + a1.area1(side));
        }
        else if(choice==2){
            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
            System.out.println("Area of circle: " + a1.area1(radius));
        }
        else if(choice==3){
            System.out.print("Enter the base of the triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = sc.nextDouble();
            System.out.println("Area of trangle: " + a1.area1(base, height));
        }
        else{
            System.out.println("wrong choice");
        }

        sc.close();
    }
}
