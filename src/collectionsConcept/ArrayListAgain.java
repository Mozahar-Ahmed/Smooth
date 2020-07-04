package collectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class ArrayListAgain {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Selenium");
        al.add("TestNG");
        al.add("Maven");
        al.add("PHP");
        //traverse to array list
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        ArrayList<Employee> emp = new ArrayList<>();

        Employee e1 = new Employee("Teddy", 30, "QA");
        Employee e2 = new Employee("Tom", 20, "HR");
        Employee e3 = new Employee("Trump", 40, "Admin");
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
Iterator<Employee> i=emp.iterator();
while(i.hasNext()){
    Employee ep=i.next();
    System.out.println(ep.name+" "+ep.age+" "+ep.dept);
}
    }


}
