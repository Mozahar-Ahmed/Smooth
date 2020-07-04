package school;

public class MyMethods {
    public void myPublicMethod(){
        System.out.println("Public method can not be accessed without creating an object");
    }
    static void myStaticMethod(){
        System.out.println("Static method can directly accessed through the class, no need to create the object");
    }

    public static void main(String[] args) {
        myStaticMethod();
        //myPublicMethod(); it throws an compile time error
        MyMethods myMethods=new MyMethods();
        myMethods.myPublicMethod();
        //myMethods.myStaticMethod();// I can call but unnecessary

    }
}
