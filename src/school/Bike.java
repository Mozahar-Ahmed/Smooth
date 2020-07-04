package school;

public class Bike{
    int x;
    public Bike(int y){
        x=y;
    }
    int modelYear;
    String modelName;
    public Bike(int year,String name){
         modelYear= year;
         modelName=name;
    }

   /* int year;
    String name;
    public Bike(int year, String name){  // It's all the same//Uncommented it and see the output
        this.year=year;
        this.name=name;
    }*/

    public static void main(String[] args) {
        Bike bike1=new Bike(100);
        System.out.println("x equals to "+ bike1.x);

        Bike bike=new Bike(1960,"Honda");
       System.out.println(bike.modelYear+ " model "+bike.modelName);
        //System.out.println(bike.name+" manufactured in "+bike.year); //

    }


}
