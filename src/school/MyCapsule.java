package school;

public class MyCapsule {
    public static void main(String[] args) {
        Capsule capsule=new Capsule();
        //capsule.name()="Azithromycin";//name has private access, so it throws compile time error
        //System.out.println(capsule.name());//error
        //If the variable was declared as public, we would expect the following output:
        // Azithromycin
        capsule.setName("Azithromycin"); // Set the value of the name variable to "Azithromycin"
        System.out.println(capsule.getName());
    }
}
