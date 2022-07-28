import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.Edible;
import fruit.Apple;
import fruit.Fruit;
import fruit.Orange;

//if (animal instanceof Chicken) {
//        Edible edibler = (Chicken) animal;
//        System.out.println(edibler.howToEat());
//        }
public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[1] = new Tiger();
        animals[0] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
        }

//        if (animal instanceof Chicken) {
//            Edible edibler = (Chicken) animal;
//            System.out.println(edibler.howToEat());
//        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
