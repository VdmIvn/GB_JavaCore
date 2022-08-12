package Lesson03;

import java.util.ArrayList;

public class FruitBox <T> {

    private float fruitWeight = 0.0f;

    ArrayList<T> fruits = new ArrayList<>();

    public <T> FruitBox(double fruitWeight) {
        this.fruitWeight = (float) fruitWeight;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        return (float) (fruits.size() * fruitWeight);
    }

    public void compare(FruitBox<?> fruitBox) {
        if(Math.abs(getWeight() - fruitBox.getWeight()) < 0) {
            System.out.println("First box weighs less than the second");
        } else if(Math.abs(getWeight() - fruitBox.getWeight()) == 0) {
            System.out.println("Both boxes weigh the same");
        } else {
            System.out.println("First box weighs more than the second");
        }

    }

    public void addFruitsToBox(FruitBox<T> fruitBox) {
        fruits.addAll(fruitBox.fruits);
        fruitBox.fruits.clear();
        System.out.println("The quantity of the fruits in the first box after adding from the second one is equal " + fruits.size());
        System.out.println("The quantity of the fruits in the second box after adding to the first one is equal " + fruitBox.fruits.size());

    }

}
