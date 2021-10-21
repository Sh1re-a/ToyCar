package se.shirwac;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
        ToyCar car = new ToyCar();
        car.drive(99);
        
        System.out.println("Driven " + car.distanceDisplay() + " meters");
        System.out.println("Battery at " + car.batteryDisplay()+ "%");
        
    }
}
