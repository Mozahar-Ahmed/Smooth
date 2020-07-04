package arrayConcept;

public class AnnonymousArray {
    static void callArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
       callArray(new int [] {22,33,55,99} );
    }
}
