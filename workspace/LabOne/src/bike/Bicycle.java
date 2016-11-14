package bike;

public class Bicycle {
    
    // the Bicycle class has
    // three fields
	 private int cadence;
     private int gear;
     private int speed;
     private boolean light;
    
        
    
    // constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
        light = false;
    }
        
   
        
    public void setGear(int newValue) {
        gear = newValue;
    }
    
    public void switchLight() {
    	light = !light;
    
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
    public void showState() {
    	System.out.println("Gear:"+gear);
    	System.out.println("Speed = "+speed);
    	System.out.println("Light on = "+light);
    
    }
        
}