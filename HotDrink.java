package HW1;

public class HotDrink extends Drink{
    private int temperature;
    public HotDrink(String name, double volume, int temperature, int price){
        super(name, volume,price);
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return getName() + ", объем " + getVolume()+ ", t = " + temperature + ", цена " + getPrice();
    }
}
