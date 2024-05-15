public class HotBeverage extends BottleOfWater{
    private int temperature;
    public HotBeverage(int cost, String name, double volume, int temperature) {
        super(cost, name, volume);
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
        return "Hot beverage: " +
                super.toString() +
                "\ntemperature: " + temperature + " °C";
    }    
}
