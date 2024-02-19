interface Motor{
    int capacity = 10;
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run(){
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine is consuming energy.");
    }
}

public class Lab5b {
    public static void main(String[] args) {
        WashingMachine w1 = new WashingMachine();

        System.out.println("Capacity of the washing machine: " + WashingMachine.capacity);

        w1.run();
        w1.consume();
    }
}