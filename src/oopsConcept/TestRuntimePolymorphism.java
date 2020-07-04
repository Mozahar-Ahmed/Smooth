package oopsConcept;

public class TestRuntimePolymorphism {
    public static void main(String[] args) {
        CentralBank cb;
        cb= new SonaliBank();
        System.out.println("Interest rate_Sonali "+cb.getInterestRate()+"%");
        cb= new RupaliBank();
        System.out.println("Interest rate_Rupali "+cb.getInterestRate()+"%");
        cb=new JanataBank();
        System.out.println("Interest rate_Janata "+cb.getInterestRate()+"%");

    }
}
