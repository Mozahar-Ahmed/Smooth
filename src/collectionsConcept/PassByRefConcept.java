package collectionsConcept;

public class PassByRefConcept {

        public static void reference(String a[]){
            a[0] = "Changed";
        }
        public static void main(String args[]){
            String []b={"Apple","Mango","Orange"};
            System.out.println("Before Function Call  "+b[0]);
            PassByRefConcept.reference(b);
            System.out.println("After Function Call  "+b[0]);
        }
    }
