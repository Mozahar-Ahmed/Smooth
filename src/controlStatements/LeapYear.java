package controlStatements;

public class LeapYear {
    public static void main(String[] args) {
        int year=1700;
        if(((year%4==0)&&(year%100!=0)||(year%400==0))){
            System.out.println("This is leap year");
        }else{
            System.out.println("This is regular year");
        }
        //odd and even number
        int num = 27;
        if(num%2==0){
            System.out.println(num +" is an even number ");
        }else{
            System.out.println(num+ " is an odd number ");
        }
        //positive negative number
        int number=-7;
        if(number>0){
            System.out.println(number +" is a positive number");
        }
        else if(number<0){
            System.out.println(number+" is a negative number");
        }else{
            System.out.println("Its Zero" );
        }
    }
}
