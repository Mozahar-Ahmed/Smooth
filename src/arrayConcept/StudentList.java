package arrayConcept;

public class StudentList {
    public static void main(String[] args) {
        String sl[];//Declaration
        sl = new String[5];//instantiation
        sl= new String[6];
        sl[0] = "Ram";//initialization
        sl[1] = "Sam";
        sl[2] = "jodu";
        sl[3] = "Modhu";
        sl[4] = "Kodu";
        System.out.println("Traversing array through for loop");
        for (int i = 0; i < sl.length; i++) {
            System.out.println(sl[i]);
        }
        System.out.println("Traversing array through enhanced for loop/for each loop");

        for(String st :sl){
            System.out.println(st);
        }
        System.out.println("Traversing array through while loop");
        int j=0;
        while(j<sl.length){
            System.out.println(sl[j]);
            j++;
        }
        System.out.println("Traversing array through do while loop");
        int i=0;
        do{
            System.out.println(sl[i]);
            i++;
        }while(i<sl.length);

        System.out.println("Traversing array through iterator");

    }
}