package school;

public class Car {
    public void throttle(){
        System.out.println("The car car run very fast");
    }
    public void speedLimit(int speed){
        System.out.println("The speed limit is:"+" "+speed);
    }
    public static void main(String[] args) {
        Car car=new Car();
        car.throttle();
        car.speedLimit(120);
    }
}
