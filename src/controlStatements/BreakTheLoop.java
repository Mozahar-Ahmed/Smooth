package controlStatements;

public class BreakTheLoop {
    public static void main(String[] args) {
        System.out.println("Break the for loop");
        for (int i = 1; i < 10; i++) {
            //System.out.println(i);//you can give the print line here also
            if (i == 5) {
                break;
            }
            System.out.println(i);//give print line bellow or above the if block
        }
        System.out.println("Break the while loop");
        int j=1;
        while(j<10){
            j++;
            if(j==5){
                break;
            }
            System.out.println(j);// out side the if block
        }
        System.out.println("Breaking the do while loop");
        //declaring variable
        int i=1;
        //do-while loop
        do{
            if(i==5){
                //using break statement
                i++;
                break;//it will break the loop
            }
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}

