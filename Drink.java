package HW1;

public class Drink extends Product{
    private double volume;
    public Drink(String name, double volume, double price) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return getName() + ", объем " + getVolume() + ", цена " + getPrice();
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


}
