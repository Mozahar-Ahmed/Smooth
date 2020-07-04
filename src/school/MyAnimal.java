package school;

public class MyAnimal {
    public static void main(String[] args) {
        Animal myAnimal=new Animal();
        Animal myCow= new Cow();
        //Cow cow=new Cow();
        Animal myCat=new Cat();
        myAnimal.animalSound();
        myCow.animalSound();
        myCat.animalSound();
        //cow.animalSound();
    }
}
