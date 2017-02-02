package com.alexanderarend.attack;

import com.alexanderarend.dto.AttackRequest;
import com.alexanderarend.dto.AttackResponse;

public interface CoordinateAttack {
	
	public boolean wasUserHitByAttack(final String currentCords);
	public String  getUserHitByAttack();
	public String calculateNewCoords(final String direction, final String coords,final int movementFactor);
	public int damageDone(final int charId);
	public int calculateRangeRemaining(final int movementType,final int range);
	public AttackResponse implementAttack(final AttackRequest attackRequest, final AttackResponse attackResponse);
}
