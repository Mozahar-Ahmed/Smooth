package oopsConcept;

public class TestPolymorphism {
    //Runtime ploymorphism with multilevel inheritance
    public static void main(String[] args) {
        Animal animal;
        animal=new Animal();
        animal=new Dog();
        animal=new BabyDog();
        new Animal().eat();
        new Dog().eat();
        new BabyDog().eat();
    }
}
