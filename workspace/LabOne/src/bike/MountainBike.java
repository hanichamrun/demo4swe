package bike;

public class MountainBike extends Bicycle {
	
	private boolean _hasFrontSuspension, _hasRearSuspension;

	public MountainBike(int startCadence, int startSpeed, int startGear, boolean hasFrontSuspension, boolean hasRearSuspension) {
		super(startCadence, startSpeed, startGear);
		
		_hasFrontSuspension = hasFrontSuspension;
		_hasRearSuspension = hasRearSuspension;
		
	}
	
	public boolean isFullSuspension () {
		if (_hasFrontSuspension&&_hasRearSuspension) return true;
		  else return false;
	}

}
