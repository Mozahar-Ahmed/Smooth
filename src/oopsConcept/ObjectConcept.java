package oopsConcept;

public class ObjectConcept {
int nonstaticVariable= 100;//non static or instance variable
static int staticVariable=200;//static variable
        //final static int staticVariable=200;//static variable
        // value will never be changed if we add a final key word before the static variable
    public static void main(String[] args) {
        int localVariable =300;// local variable
        System.out.println(localVariable);
        System.out.println(staticVariable);
       //System.out.println(nonstaticVariable);
        ObjectConcept oc=new ObjectConcept();
        System.out.println(oc.nonstaticVariable);

        //updated values
        oc.nonstaticVariable=101;//reassigning the value to variables
        //nonstaticVariable=102;
        System.out.println("Updated"+oc.nonstaticVariable);
        oc.staticVariable=201;// we can reassign the value to a static variable using its class object
        staticVariable=202;
        System.out.println("updated"+oc.staticVariable);
        localVariable=301;
        System.out.println("updated"+localVariable);
    }
}
