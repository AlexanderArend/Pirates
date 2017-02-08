package com.alexanderarend.attack;

import java.util.Map.Entry;

import org.springframework.stereotype.Component;

import com.alexanderarend.coords.Coordinates;
import com.alexanderarend.coords.MoveCoords;
import com.alexanderarend.domain.OtherUsersCoords;
import com.alexanderarend.dto.AttackRequest;
import com.alexanderarend.dto.AttackResponse;
import com.alexanderarend.parse.ParseCoords;

@Component
public class CoordinateAttackImpl implements CoordinateAttack{
	private String userIdHit;

	public AttackResponse implementAttack(final AttackRequest attackRequest,
		 final	AttackResponse attackResponse) {
		attackResponse.setUserId(attackRequest.getUserId());
		attackResponse.setAttackId(attackRequest.getAttackId());
		attackResponse.setDamageDone(damageDone(Integer.parseInt(attackRequest.getUserId().substring(0))));
		attackResponse.setNewCoords(calculateNewCoords(attackRequest.getDirection(),attackRequest.getCurrentCoords(),attackRequest.getMovementType()));
		attackResponse.setHitTrue(wasUserHitByAttack(attackRequest.getCurrentCoords())?"true":"false");
		attackResponse.setUserIdHitByAttack(getUserHitByAttack());
		attackResponse.setRangeRemaining(calculateRangeRemaining(attackRequest.getMovementType(), attackRequest.getRange()));
	
		return attackResponse;
	}
	

	public String getUserHitByAttack() {
		return userIdHit;
	}


	public String calculateNewCoords(final String direction,final String coords,final int movementFactor) {
		
		Coordinates cords = ParseCoords.parseCoordinates(coords);
		return MoveCoords.changeCoords(cords,direction, movementFactor).toString();
	}


	public int damageDone(final int charId) {
		switch(charId){
		case 1:
			return 5;
		case 2:
			return 10;
		case 3:
			return 15;
			
		}
		return 0;
	}


	
	public boolean wasUserHitByAttack(final String currentCords) {
		for (Entry coords: OtherUsersCoords.getAllUsersCoords().entrySet()){
			if(coords.getValue().equals(currentCords))
					{
					userIdHit = coords.getKey().toString();
					return true;
					}
		}
		return false;
	}

	public int calculateRangeRemaining(final int movementType,final int range) {
		return range - movementType ;
	}



}
