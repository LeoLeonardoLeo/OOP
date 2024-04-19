import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //basic objects
        //constructors, getters
        Fruit apple = new Fruit("Apple", "Red", 20, 6.50);
        Fruit banana = new Fruit("Banana", "Yellow", 10, 5.25);
        Fruit pineapple = new Fruit("Pineapple", "Yellow", 1, 3.97);

        //array of objects
        Fruit[] fruits = {apple, banana, pineapple};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

    }

}