package collectionsConcept;

import java.util.Arrays;

public class PracticeArray {
    public static void main(String[] args) {
        int ar[];//declaration
        ar = new int[4];//initialization
        ar[0] = 23;
        ar[1] = 12;
        ar[2] = 12;
        ar[3] = 5;
        System.out.println(Arrays.asList(ar));
        int arr[] = {6, 5, 8, 6, 1, 3, 7};
        System.out.println(Arrays.toString(ar));
        int a[] = {6, 5, 8, 6, 1, 3, 7};
        int a1[] = {6, 5, 9, 6, 1, 3, 5};
        short as[] = {6, 5, 9, 6, 1, 3, 5};
        for (short i = 0; i < as.length; i++)
            System.out.println(as[i]);
        System.out.println(Arrays.equals(a, a1));
        System.out.println(Arrays.equals(a, arr));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a1, 9));
        double[] d = {1.22, 2.85, 6.23, 2.33};
        //for loop
        for (int i = 0; i < d.length; i++)
            System.out.println(d[i]);
        //Enhanced for loop
        for (double dou : d) {
            System.out.println(dou);
            int[] array = new int[10];
            //int [] array={1,2,3,4,5,6,7};
            for (int count = 0; count < array.length; count++) {
                array[count] = count + 1;
                System.out.println("array[" + count + "] = " + array[count]);
            }
            /*for (int count=0;count<7;count++){
                System.out.println("array["+count+"] = "+array[count]);
            }*/
            System.out.println("Length of Array  =  " + array.length);
            //array[10]=11;
        }

    }
}
