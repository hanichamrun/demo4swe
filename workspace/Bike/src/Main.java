package bike;

public class Main {
	

	public static void main(String[] args) {
		System.out.println("Setting up Bike.");
		Bicycle b = new Bicycle(5, 5, 5);  
		b.showState();
		b.speedUp(7);
		b.switchLight();
		b.showState();
		
		MountainBike mb = new MountainBike(5, 5, 5, true, false);  
		mb.speedUp(7);
		
		MountainBike mb2 = new MountainBike(5, 5, 5, true, true);
		
		if (mb.isFullSuspension()) System.out.println("mb is full suspension");//this will be false
		if (mb2.isFullSuspension()) System.out.println("mb2 is full suspension");//this will be true

	}

}
