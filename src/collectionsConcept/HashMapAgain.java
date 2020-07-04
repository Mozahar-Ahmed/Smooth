package collectionsConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapAgain {
    public static void main(String[] args) {
        /*HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"java");
        map.put(2,"python");
        map.put(3,"ruby");
        System.out.println(map.get(1));
        System.out.println(map.get(4));
      //remove elements
        System.out.println( map.remove(3));
        map.put(4,"C#");//insert element
        map.put(5,"C++");
        System.out.println(map.remove(2,"python"));
        System.out.println(map);
        //iterate hashmap
    for(Entry m : map.entrySet()){
        m.getKey();
        m.getValue();
        System.out.println(m.getKey()+" "+m.getValue());
        System.out.println();*/

        HashMap<Integer,Employee>emp=new HashMap<>();
        Employee e1= new Employee("Tom",25,"Admin");
        Employee e2= new Employee("Peter",28,"QA");
        Employee e3= new Employee("Brown",29,"Dev");
        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);
        //Traverse the hashmap
        for(Entry<Integer,Employee> en:emp.entrySet()){
           Integer count = en.getKey();
           Employee e = en.getValue();
            System.out.println("Employee "+count+ " info: ");
            System.out.println("Name: "+e.name+" "+"Age: "+e.age+" "+"Dep: "+e.dept);

        }
    }

    }

