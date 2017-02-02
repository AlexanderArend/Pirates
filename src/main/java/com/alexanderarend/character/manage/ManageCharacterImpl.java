package com.alexanderarend.character.manage;

import com.alexanderarend.dto.PlayerRequest;
import com.alexanderarend.dto.PlayerResponse;

public class ManageCharacterImpl implements ManageCharacter {

	public PlayerResponse manageCharacterInteraction(final PlayerRequest playerRequest,
			final PlayerResponse playerResponse) {
		playerResponse.setIsDead(isDead(playerRequest.getCurrentHealth(),
				playerRequest.getDeductedhealth())?"true":"false");
		playerResponse.setUserId(playerRequest.getUserId());
		playerResponse.setCurrentHealth(calculateCurrentHealth(playerRequest.getCurrentHealth(),
				playerRequest.getDeductedhealth()));
		playerResponse.setSuccessUpdating("true");
		return playerResponse;
	}


	public boolean isDead(final int healthRemaining,final  int damageDone) {
		
		return (healthRemaining-damageDone) <= 0;
	}

	
	public int calculateCurrentHealth(final int healthRemaining,final int damageDone) {
		
		return ((healthRemaining-damageDone) < 0)?0:(healthRemaining-damageDone);
	}
	
	

}
