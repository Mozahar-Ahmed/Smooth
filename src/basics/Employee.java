package basics;

public class Employee {
    int id;
    String name;
     static String dept="HR";
    Employee(int i,String n){
        id=i;
        name=n;
    }
    static void change(){
        dept="QA";
    }
    void display(){
        System.out.println(id+" "+name+" "+dept);
    }

}
