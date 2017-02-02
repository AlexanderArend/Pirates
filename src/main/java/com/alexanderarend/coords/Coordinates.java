package com.alexanderarend.coords;

public class Coordinates {
	private int upDown;
	private int eastWest;
	public Coordinates(final int inUpDown,final int inEastWest) {
		this.upDown = inUpDown;
		this.eastWest = inEastWest;
	}
	public int getUpDown() {
		return upDown;
	}
	public void setUpDown(int upDown) {
		this.upDown = upDown;
	}
	public int getEastWest() {
		return eastWest;
	}
	public void setEastWest(int eastWest) {
		this.eastWest = eastWest;
	}
	@Override
	public String toString() {
		return (upDown + "," + eastWest);
	}
	
	public void moveSouth(final int movementFactor){
		upDown -= (1*movementFactor);
	}
	public void moveNorth(final int movementFactor){
		upDown += (1*movementFactor);
	}
	public void moveEast(final int movementFactor){
		eastWest -=(1*movementFactor);
	}
	public void moveWest(final int movementFactor){
		eastWest +=(1*movementFactor);
	}
	public void moveSouthEast(final int movementFactor){
		eastWest -=(1*movementFactor);
		upDown -= (1*movementFactor);
	}
	public void moveNorthEast(final int movementFactor){
		upDown += (1*movementFactor);
		eastWest -=(1*movementFactor);
	}
	public void moveSouthWest(final int movementFactor){
		eastWest +=(1*movementFactor);
		upDown -= (1*movementFactor);
	}
	public void moveNorthWest(final int movementFactor){
		upDown += (1*movementFactor);
		eastWest +=(1*movementFactor);
	}
}
