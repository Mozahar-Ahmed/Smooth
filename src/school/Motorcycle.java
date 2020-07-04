package school;

public class Motorcycle extends Vehicle {
    private  String model ="CDI100";
    private void run(){
        System.out.println("Honda runs very fast");
    }
    public static void main(String[] args) {
        Motorcycle motorcycle=new Motorcycle();
        motorcycle.honk();
        System.out.println(motorcycle.name);
        motorcycle.run();
        System.out.println(motorcycle.model);
    }
}
