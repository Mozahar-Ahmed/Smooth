package controlStatements;

public class EnumWithSwitch {
    private enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY,SATURDAY;}

    public static void main(String[] args) {
        Day day=Day.SUNDAY;

        switch (day){
            case MONDAY:
                System.out.println("Another busy week started");
                break;
            case TUESDAY:case WEDNESDAY:case THURSDAY:
                System.out.println("Keep on toiling!!");
                break;
            case FRIDAY:
                System.out.println("Weekend coming, countdown starts");
                break;
            case SATURDAY:
                System.out.println("Weekend! Wow!!");
                break;
            default:
                System.out.println("End of weekend!!Haa...");

        }

    }

}

