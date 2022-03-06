package Animale;

public class Plate {
    private int food;
    private int maxVolume;
    
    Plate(int food, int maxVolume) {
        this.food = food;
        this.maxVolume = maxVolume;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= maxVolume) {
            this.food += food;
        }
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}


