import java.util.Scanner;

abstract class student{
    int[] roll = new int[8];
    int reg_no;

    public void getinput(int a[], int b){
        roll=a; 
        reg_no=b;
    }
    abstract void course();
}

class kittian extends student{

    void course() {
        if(roll[0]!=0 && roll[3]==5){
            System.out.print("B.Tech. (Computer Science & Engg)");
        }
        else if(roll[0]!=0 && roll[3]==4){
            System.out.print("B.Tech. (Information Technology)");
        }
        else if(roll[0]!=0 && roll[3]==3){
            System.out.print("B.Tech. (Electronics Engineering)");
        }
        else if(roll[0]!=0 && roll[3]==2){
            System.out.print("B.Tech. (Electrical Engineering)");
        }
        else if(roll[0]!=0 && roll[3]==1){
            System.out.print("B.Tech. (Mechanical Engineering)");
        }
        if(roll[0]==0 && roll[4]==5){
            System.out.print("B.Tech. (Computer Science & Engg)");
        }
        else if(roll[0]==0 && roll[4]==4){
            System.out.print("B.Tech. (Information Technology)");
        }
        else if(roll[0]==0 && roll[4]==3){
            System.out.print("B.Tech. (Electronics Engineering)");
        }
        else if(roll[0]==0 && roll[4]==2){
            System.out.print("B.Tech. (Electrical Engineering)");
        }
        else if(roll[0]==0 && roll[4]==1){
            System.out.print("B.Tech. (Mechanical Engineering)");
        }      
    }
    
}

class Lab5a{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kittian k1 = new kittian();
        student s1  = new kittian();

        System.out.print("Enter your roll no.:");
        int r = sc.nextInt();
        int r2 =r;
        int r1[] = new int[8];
        for(int i=8;i>0;i--){
            int temp = r%10;
            r1[i-1]= temp;
            r = r/10;
        }
        System.out.print("Enter your registration number: ");
        int reg_no = sc.nextInt();

        k1.getinput(r1, reg_no);

        System.out.println("Rollno - " + r2);
        System.out.println("Registration no - "+k1.reg_no);
        System.out.print("Course - ");
        k1.course();

        sc.close();
    }
}