public class Main {
    public static void main(String[] args) {
        Product product1 = new BottleOfWater(100, "Aquaminerale", 0.4);
        Product product2 = new BottleOfWater(110, "cola", 0.5);
        Product product3 = new BottleOfWater(100, "fanta", 0.33);
        Product product4 = new BottleOfWater(120, "sprite", 1.0);
        Product product5 = new BottleOfWater(90, "rainbow", 0.6);
        Product product6 = new HotBeverage(50, "coffee", 0.35, 80);
        Product product7 = new HotBeverage(40, "tea", 0.3, 90);
        Product product8 = new HotBeverage(45, "cappuccino", 0.45, 75);
        Product product9 = new HotBeverage(55, "latte macchiato", 0.4, 70);

        VendingMachine machine1 = new VendingMachineBottleOfWater();
        machine1.addProduct(product1);
        machine1.addProduct(product2);
        machine1.addProduct(product3);
        machine1.addProduct(product4);
        machine1.addProduct(product5);

        VendingMachineHotBeverage machine2 = new VendingMachineHotBeverage();
        machine2.addProduct(product6);
        machine2.addProduct(product7);
        machine2.addProduct(product8);
        machine2.addProduct(product9);

        System.out.println(machine2.getProduct("coffee"));
        System.out.println("\n" + machine2.getProduct("cappuccino", 0.45, 75));
        System.out.println("\n" + machine2.getProduct("coffee", 0.4, 75)); // проверка поиска с неверным объёмом напитка
    }
}
