package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cuc cuc";
    }

    @Override
    public String howToEat() {
        return "toi co the an gao";
    }
}
