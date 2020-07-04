package controlStatements;

public class PracticeIfConditionals {

    public static void main(String[] args) {
        //if statement
        int i=10;
        if(i<=10){
            System.out.println("Value of i is "+i);
        }
        //nested if condition
        int num=100;
        if(num<=100){
            System.out.println("Num value is "+num);
            if(num>50){
                System.out.println("Num value is "+num);
        }
        }
        //if else condition
        int count = 105;
        if(count<=100){
            System.out.println("Count is within 100");
        }
        else{ System.out.println("count is more than 100");
        }
        //if else if condition
        int marks=74;
        String grade;
        if(marks>=80){
            grade="A";
        }
        else if(marks>=70){
            grade="B";
        }
        else if(marks>=60){
            grade="C";
        }
        else if(marks>=50){
            grade="D";
        }
        else{
            grade="F";
        }
        System.out.println("Grade is: "+grade);
    }
}
