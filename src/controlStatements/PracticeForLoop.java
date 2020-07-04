package controlStatements;

public class PracticeForLoop {
    public static void main(String[] args) {
        System.out.println("Reverse pyramid");

        for(int count=1;count<=6;count++){
            for(int num=6;num>=count;num--){
                System.out.print(" * ");

            }
            System.out.println();
        }
        System.out.println("Straight pyramid");

        for(int count=1;count<=5;count++){
            for(int num=1;num<=count;num++){
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
