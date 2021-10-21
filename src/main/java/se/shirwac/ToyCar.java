package se.shirwac;

public class ToyCar {
    private int carBattery = 100;
    private int drivenMeter = 0;

   

    public int distanceDisplay(){
    return drivenMeter;
    }
    

    public int batteryDisplay(){
        return carBattery;       
    }
    public int drive(int amountofDrives){
        

       for(int i = 0; i < amountofDrives; i++){
        if(carBattery == 0){
            break;
        }
        int drive20Meter = 20;
        drivenMeter = drivenMeter + drive20Meter;

        int förbrukadBatteri = 0;
        for(int j = 20; j <= drive20Meter; j+=20){
            förbrukadBatteri++;
        }

        carBattery = carBattery - förbrukadBatteri;
    }
        
        return drivenMeter;

    }





    
}
