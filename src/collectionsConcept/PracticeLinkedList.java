package collectionsConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class PracticeLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList;
        linkedList = new LinkedList();
        linkedList.add("Ram");
        linkedList.add("Sam");
        linkedList.add("Jadu");
        linkedList.add("Madhu");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println(linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //Appends the specified element to the end of this list.
        linkedList.add("New");
        System.out.println(linkedList);
        //Appends the elements in the first position of the list
        linkedList.addFirst("Primary");
        System.out.println(linkedList);
        //Appends the given element to the end of this list.
        linkedList.addLast("LastTrip");
        System.out.println(linkedList);
        //Returns the first element in this list.
        System.out.println("Return : " + linkedList.getFirst());
        //Returns the last element in this list.
        System.out.println(linkedList.getLast());
        //Removes the first occurrence of the specified element in this list
        System.out.println(linkedList.remove("Madhu"));
        System.out.println(linkedList);
         //Removes and returns the first element from this list.
        System.out.println(linkedList.removeFirst());
        //Removes and returns the last element from this list
        System.out.println(linkedList.removeLast());
        //Replaces the element at the specified position in this list with the specified element.
        System.out.println(linkedList.set(1, "Shamim"));
        System.out.println(linkedList);
        //Returns the number of elements in this list.
        System.out.println(linkedList.size());
        //Returns an array containing all of the elements in this list in the correct order
        System.out.println(linkedList.toArray());
        //Returns an array containing all of the elements in this list in the correct order;
        // the runtime type of the returned array is that of the specified array.
        //linkedList.toArray(linkedList);

        //Cloning
        linkedList.clone();
        LinkedList cloneList = (LinkedList) linkedList.clone();
        System.out.println("My clone list:" + cloneList);
        System.out.println(cloneList.get(0));
    }

}
