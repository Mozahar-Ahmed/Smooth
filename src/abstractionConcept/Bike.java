package abstractionConcept;

public abstract class  Bike {
    public static void main(String[] args) {

    }
    Bike(){
        System.out.println("Bike manufactured");
    }
    abstract void run();
    void refuel(){
        System.out.println("Refueling.....");
    }
}
