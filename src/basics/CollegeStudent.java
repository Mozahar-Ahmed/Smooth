package basics;

public class CollegeStudent {
    int rollNumber;
    String name;
     static String collegeName="BUET";
    CollegeStudent(int i, String s){
        rollNumber=i;
        name=s;
    }
    void display(){
        System.out.println(rollNumber+" "+name+" "+collegeName);
    }
}
