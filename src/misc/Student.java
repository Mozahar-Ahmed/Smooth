package misc;

public class Student {
    public static void main(String[] args) {
        //int num = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=3; j++) {


                if (i==3&&j == 2) {
                    continue;

                }
                System.out.println(i+" "+j);
            }
        }
    }
}