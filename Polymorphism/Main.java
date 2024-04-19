import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //what is polymorphism?
        //in simple terms it is method (function) overloading and overriding

        //let's say we have a method that takes 2 numbers and adds them. We can override or overload the method to change it

        //Polymorphism has access to inheritance
        //Overloading allows classes to have the same method names but different parameters
        //Overriding works with inheritance calling the same method

        overloading overload = new overloading();
        int result = overload.calculate(5, 4); //calls int calculate
        System.out.println(result);
        System.out.println();
        double result2 = overload.calculate(8, 7); //calls the double calculate but ADDS them
        System.out.println(result2);


        Animal a1 = new Animal();
        a1.makeNoise();
        Dog d1 = new Dog();
        d1.makeNoise();
    }


}
class overloading{
    public int calculate(int a, int b){
        return a + b;
    }
    public double calculate(double a, double b){
        return a * b;
    }
    //as we can see they are both called "calculate", but they have different parameters
    //and both have different method bases, but will always do the first one

}
//Overriding
class Animal{
    public void makeNoise(){ //original method
        System.out.println("Animal noise");
    }
}
class Dog extends Animal{
    public void makeNoise(){ //overriden method for dog class
        System.out.println("Woof");
    }
}