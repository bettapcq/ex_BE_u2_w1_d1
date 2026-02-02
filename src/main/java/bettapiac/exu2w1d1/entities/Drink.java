package bettapiac.exu2w1d1.entities;

public class Drink extends MenuItem {
    private DrinkSize size;

    public Drink(String name, Double price, int calories, DrinkSize size) {
        super(name, price, calories);
        this.size = size;
    }

    public DrinkSize getSize() {
        return size;
    }

    public void setSize(DrinkSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size=" + size +
                '}';
    }
}
