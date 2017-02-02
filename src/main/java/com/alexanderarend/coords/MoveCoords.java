package com.alexanderarend.coords;

public class MoveCoords {

public static Coordinates changeCoords(final Coordinates coords, final String direction, final int movementFactor){
	String theDirection = direction.toLowerCase();
	Directions directions = Directions.valueOf(theDirection) ;
	switch (directions){
	case south:
		coords.moveSouth(movementFactor);
		break;
	case north:
		coords.moveNorth(movementFactor);
		break;
	case east:
		coords.moveEast(movementFactor);
		break;
	case west:
		coords.moveWest(movementFactor);
		break;
	case northwest:
		coords.moveNorthWest(movementFactor);
		break;
	case northeast:
		coords.moveNorthEast(movementFactor);
		break;
	case southeast:
		coords.moveSouthEast(movementFactor);
		break;
	case southwest:
		coords.moveSouthWest(movementFactor);
		break;
		
	}
	return coords;
}
}
