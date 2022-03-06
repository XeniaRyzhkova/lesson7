package Animale;

public class Cat {
    private String name;
    private int appetite;
    public boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    void setFullness (boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "(name=" + name + ", appetite=" +
                appetite + ", fullness=" + fullness + "}";
    }
}