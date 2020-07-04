package collectionsConcept;

import java.util.HashMap;

public class PracticeHashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(0,"DHK");
        hm.put(1,"CTG");
        hm.put(2,"CTG");
        hm.put(3,"NOA");
        System.out.println(hm);
        for(int i=0;i<hm.size();i++){
            System.out.println(hm.get(i));
        }
        System.out.println(hm.size());
        System.out.println(hm.get(0));
        System.out.println(hm.remove(1));
        System.out.println(hm.remove(2,"MYM"));
        System.out.println(hm.size());
        System.out.println(hm);
    }
}
