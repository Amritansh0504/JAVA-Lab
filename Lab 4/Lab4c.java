class apple{
    void show(){
        System.out.println("apple");
    }
}

class cherry extends apple{
    void show(){
        System.out.println("cherry");
    }
}

class banana extends apple{
    void show(){
        System.out.println("banana");
    }
}


public class Lab4c {
    public static void main(String[] args) {
            apple a1 = new apple();
            cherry c1 = new cherry();
            banana b1 = new banana();

            a1.show();
            c1.show();
            b1.show();
    }    
}
