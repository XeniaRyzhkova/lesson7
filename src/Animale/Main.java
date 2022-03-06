package Animale;

public class Main {


    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Vasia", 10),
                new Cat("Pushok", 15),
                new Cat("Mila", 20),
        };

        Plate plate = new Plate(70, 50);
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
                System.out.println(plate);
                plate.add(45);
                System.out.println(plate);

                for (Cat cat : cats) {
                    cat.setFullness(false);
                    cat.eat(plate);
                    System.out.println(cat);
                }
                System.out.println(plate);
            }
        }





