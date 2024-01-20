import java.util.Scanner;

class Lab1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name; 
        int Roll_no;
        String section;
        String branch;

        for(int i=0; i<3; i++){
            System.out.print("Enter the name for "+(i+1)+" user: ");
            name = sc.nextLine();
            System.out.print("Enter the Roll number for "+(i+1)+" user: ");
            Roll_no = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the section for "+(i+1)+" user: ");
            section = sc.nextLine();
            System.out.print("Enter the branch for "+(i+1)+" user: ");
            branch = sc.nextLine();

            System.out.println();
            System.out.println("The name, roll no, section and branch for user "+(i+1)+" is: ");
            System.out.println(name);
            System.out.println(Roll_no);
            System.out.println(section);
            System.out.println(branch);
        }
        sc.close();
    }
}