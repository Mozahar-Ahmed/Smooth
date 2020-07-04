package collectionsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PracticeArrayList {
    public static void main(String[] args) {

    //Creating a generic ArrayList
    ArrayList<String> arlTest = new ArrayList<String>();


    //Size of arrayList
        arlTest.size();
  System.out.println("1.Size of ArrayList at creation: " + arlTest.size());
    //Lets add some elements to itarlTest.add("B");
  arlTest.add("D");
  arlTest.add("U");
  arlTest.add("K");
  arlTest.add("Z");
  arlTest.add("E");
  arlTest.add("A");

  Iterator it =arlTest.iterator();
        System.out.println("Print the list");
  while (it.hasNext()){
      System.out.println(it.next());
      Collections.reverse(arlTest);
      Iterator i=arlTest.iterator();
      System.out.println("The reverse array list");
      while (i.hasNext()){
          System.out.println(i.next());
      }
  }
        System.out.println(new String[arlTest.size()]);
    //Recheck the size after adding elements
  System.out.println("2.Size of ArrayList after adding elements: " + arlTest.size());

    //Display all contents of ArrayList
        System.out.println(arlTest);
  System.out.println("3.List of all elements: " + arlTest);

    //Remove some elements from the list
  arlTest.remove("D");
  System.out.println("4.See contents after removing one element: " + arlTest);

    //Remove element by index
  arlTest.remove(2);
  System.out.println("5.See contents after removing element by index: " + arlTest);

    //Check size after removing elements
  System.out.println("6.Size of arrayList after removing elements: " + arlTest.size());
  System.out.println("7.List of all elements after removing elements: " + arlTest);

    //Check if the list contains "K"
  System.out.println(arlTest.contains("K"));

        System.out.println("WOW>>>>>>>>>>>>>>>>>>>>>>>>>>>>WOW");



        ArrayList<String> arylTest = new ArrayList<String>(5);
        System.out.println(arylTest.size());
        int n=5;
        ArrayList<Integer> ali=new ArrayList<>(n);
        System.out.println(ali.size());
        for(int i=0;i<5;i++)
            ali.add(i);
        System.out.println(ali);
        /*ali.add(11);
        ali.add(22);
        ali.add(33);
        ali.add(44);*/
        System.out.println(ali);
        System.out.println(ali.size());
        ali.remove(2);
        System.out.println(ali);
        ali.contains(0);
        System.out.println(ali.contains(0));

        List al =new ArrayList();//before generics
        al.add(10);
        al.add("10"); //you can store any type of object, no error
       Integer i= (Integer) al.get(0);//typecasting
        String s= (String) al.get(1);//typecasting
       List<String> list=new ArrayList<>();// after generics//With Generics, it is required to specify the type of object we need to store.
        //list.add(12);//compile time error
        list.add("12");
        list.add("HI");
      String st= list.get(1);// no need to typecast the object
}
}