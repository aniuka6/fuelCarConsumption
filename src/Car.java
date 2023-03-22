public class Car {
    private Engine engine;
    private int fuel;

    public Car(){
        engine = new Engine("Ferrari");
        System.out.println("Utworzono samochód z silnikiem" + engine.engineType);
    }

    //metoda spalająca paliwo

    public void go() throws InterruptedException{
        while (fuel > 0){
            engine.consumeFuel();
            System.out.println("Pozostało " + fuel + " litrów paliwa");
            Thread.sleep(1000); // milisekndy
        }
        System.out.println("Brak paliwa zatankuj!");
    }

    // metoda tankująca

    public void refuel(int liters){
        fuel = fuel + liters;
    }

    public class Engine{
        private String engineType;
        private static final int FUEL_CONSUMPTION = 20;

        public Engine(String type){
            engineType = type;
        }
        public void consumeFuel(){
            fuel = fuel - FUEL_CONSUMPTION;
        }
    }
}
