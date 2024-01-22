public class Lab2f {
    
    private static int i=0;
    public Lab2f(){
        i++;
    }
    public static int counter(){
        return i;
    }
    
    public static void main(String[] args) {
        Lab2f obj1 = new Lab2f();
        Lab2f obj2 = new Lab2f();
        Lab2f obj3 = new Lab2f();
        
        System.out.println("No of objects created: "+counter());
    }
}