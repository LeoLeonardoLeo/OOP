public class Fruit {
    private String name;
    private String colour;
    private int quantity;
    private double price;
    //constructors
    public Fruit(String name, String colour, int quantity, double price) {
        this.name = name;
        this.colour = colour;
        this.quantity = quantity;
        this.price = price;
    }
    //need getters because of private

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    //to string method
    @Override
    public String toString() {
        return "Fruit List: \n" +
                "Name: " + name + " \n" +
                "Colour: " + colour + "\n" +
                "Quantity: " + quantity + "\n" +
                "Price: " + price + "\n" +
                " ";
    }
}
