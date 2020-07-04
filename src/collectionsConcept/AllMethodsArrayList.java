package collectionsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AllMethodsArrayList {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        System.out.println(al.size());
        //Returns true if this list contains no elements.
        System.out.println(al.isEmpty());
        //add new elements in this list
        al.add("Tom");
        al.add("peter");
        al.add("Mozahar");
        al.add("Trumpy");
        al.add("Sarina");
        al.add("Tom");
        // print all the elements in the list using for loop
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        //print array list of the elements
        System.out.println(al);
        //Returns true if this list contains no elements.
        System.out.println(al.isEmpty());
        //Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
        System.out.println(al.subList(0,3));
        //Returns the number of elements in this list.
        System.out.println(al.size());
        //Replace the element at the specified location
        al.set(1,"Python");
        System.out.println(al);
        //index the first occurrence of a specific element is either returned, or -1 in case the element is not in the list.
        System.out.println(al.indexOf("Trumpy"));
        //Returns the element at the specified position in this list.
        System.out.println(al.get(2));
        //Removes the element at the specified position in this list.
        al.remove(0);
        System.out.println(al);
        //Removes the first occurrence of the specified element from this list, if it is present.
        al.remove("Trumpy");
        System.out.println(al);
        //Returns true if this list contains the specified element.
        System.out.println(al.contains("Sarina"));
        //to return an array containing all of the elements in the list in correct order.
        System.out.println(Arrays.toString(al.toArray()));
        //to return a shallow copy of an ArrayList/cloning
        al.clone();
        ArrayList <String> clonnedList= (ArrayList<String>) al.clone();
        System.out.println("My clonned list : "+clonnedList);
        //printing elements using iterator
        Iterator it=clonnedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //to remove all the elements from any list.
         al.clear();
        System.out.println(al);
        System.out.println(al.size());
    }
}
