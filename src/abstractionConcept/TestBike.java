package abstractionConcept;
import static java.lang.System.*;//static import allow you to use static member of that class directly without their class reference
  public class TestBike extends Honda {
    public static void main(String[] args) {
        Bike bike=new Honda();
        bike.run();
        bike.refuel();
        out.println("print without system ");//no need to use system(class name)
        out.println();

    }
}
