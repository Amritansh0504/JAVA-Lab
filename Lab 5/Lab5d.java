import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    @Override
    public void getDetails() {
        System.out.println("Employee id - " + empId);
        System.out.println("Employee name - " + empName);
    }

    @Override
    public void getDeptDetails() {
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }

    public void setEmployeeDetails(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void setDeptDetails(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}

public class Lab5d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Head head = new Head();

        System.out.print("Enter employee id - ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee name - ");
        String empName = scanner.nextLine();

        System.out.print("Enter department id - ");
        int deptId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter department name - ");
        String deptName = scanner.nextLine();

        head.setEmployeeDetails(empId, empName);
        head.setDeptDetails(deptId, deptName);

        head.getDetails();
        head.getDeptDetails();

        scanner.close();
    }
}