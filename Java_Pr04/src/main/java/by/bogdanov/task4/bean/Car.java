package by.bogdanov.task4.bean;

public class Car {

    private String manufacturer;
    private String model;
    public Engine engine;
    public Wheel wheel;

    public Car(){}

    public Car(Engine eng, Wheel whl){
        this.engine = eng;
        this.wheel = whl;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getVehicle(){
        return manufacturer + " " + model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString(){
        return "Created car is: " + this.manufacturer + " " + this.model + "\n"
                + "Type of engine " + this.engine.typeFuel + "\n"
                + "Power hp: " + this.engine.maxPower + "\n"
                + "Tyres: " + this.wheel.manufacturer + " " + "R-"+ this.wheel.size + "\n";
    }

    public static class Engine {

        private String typeFuel;
        private int maxPower;

        public Engine(){}

        public Engine(String fuel, int power){
            this.maxPower = power;
            this.typeFuel = fuel;
        }
        public void setTypeFuel(String typeFuel) {
            this.typeFuel = typeFuel;
        }
        public void setMaxPower(int maxPower) {
            this.maxPower = maxPower;
        }
    }

    public static class Wheel {

        public String manufacturer;
        public int size;

        public Wheel(){}

        public Wheel(String brand, int size){
            this.manufacturer = brand;
            this.size = size;
        }
        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
        public void setSize(int size) {
            this.size = size;
        }

    }
}
