package misc;

public class SchoolLearning {
    public static void main(String[] args) {
        //maximum positive(+) value for the numeric data types, if you increase any value just by 1 it will show you error.
        byte num = 127;
        short myNum = 32767;
        int hisNum = 2147483647;
        long randomNum = 922337211125631258L;
        //The float data type can store fractional numbers from 3.4e−038 to 3.4e+038.
        float hisfractionNum = 3.4e038f;
        System.out.println(hisfractionNum);//Output=3.4E38
        //The capital E just means 10x
        // So 3.4E38 just means 3.4*10*38(3.4*10 to the power 38)

        //The double data type can store fractional numbers from 1.7e−308 to 1.7e+308
        double myfractionNum = 1.7e308d;//it is actually a very LARGE number, it is 170 followed by another 306 zeros then a decimal point.
        System.out.println(myfractionNum);  //Output=1.7E308
        //The capital E just means 10x
        // So 1.7E308 just means 1.7*10*308(1.7*10 to the power 308)

    }
}
