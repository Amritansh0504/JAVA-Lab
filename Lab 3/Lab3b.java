class overload{
    int substract(int a, int b){
        int c = a-b;
        return c;        
    }
    double substract(double a, int b){
        double c = a-b;
        return c;
    }
}


public class Lab3b {
    public static void main(String[] args) {
        overload o1 = new overload();

        System.out.println(o1.substract(432, 32));
        System.out.println(o1.substract(4324.54, 5564));
    }
}
