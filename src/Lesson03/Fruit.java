package Lesson03;

public class Fruit {
    private int fruitsNum;
    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public int getFruitsNum() {
        return fruitsNum;
    }

    public float getWeight() {
        return weight;
    }

    public void setFruitsNum(int fruitsNum) {
        this.fruitsNum = fruitsNum;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
