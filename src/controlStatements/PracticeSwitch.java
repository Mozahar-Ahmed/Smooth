package controlStatements;

public class PracticeSwitch {
    public static void main(String[] args) {
        //Switch condition without break
        int num=200;
        switch (num){
            case 100:
                System.out.println("case i value is "+num);
            case 200:
                System.out.println("Case 2 value is "+num);
            case 300:
                System.out.println("case 3 value "+num);
            default:
                System.out.println("Default case value is "+num);
        }
        //Switch condition with break
        int count=300;
        switch (count){
            case 100:
                System.out.println("Actual count is "+count);
                break;
            case 200:
                System.out.println("Actual count is "+ count);
                break;
            case 300:
                System.out.println("Actual count is "+count);
                break;
            default:
                System.out.println("Actual count is "+count);
        }
    }
}
