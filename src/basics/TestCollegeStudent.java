package basics;

public class TestCollegeStudent {
    public static void main(String[] args) {
        CollegeStudent collegeStudent =new CollegeStudent(123,"Marhaba");
        CollegeStudent collegeStudent1 =new CollegeStudent(456,"Mashallah");
        CollegeStudent collegeStudent2 =new CollegeStudent(789,"Maujude");
        //we can change the collegeName of all objects by the single line of code
        //College.collegeName="BAU";
        //But can not change rollNumber or name as they are not static
        //College.rollNumber();//non static field can not be referenced from a static context
        collegeStudent.display();
        collegeStudent1.display();
        collegeStudent2.display();

    }
}
