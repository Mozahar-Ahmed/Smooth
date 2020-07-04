package misc;

import java.util.Random;

public class RandomNumberConcept {
    public static void main(String[] args) {
        int []randomTag=new int [5];
        Random random=new Random(10000);
        for(int i=0; i<randomTag.length;i++){
            randomTag [i]=random.nextInt(10000);
            System.out.println(randomTag[i]);
        }
    }
}
