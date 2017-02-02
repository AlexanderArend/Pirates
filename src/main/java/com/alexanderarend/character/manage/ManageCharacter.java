package com.alexanderarend.character.manage;

import com.alexanderarend.dto.PlayerRequest;
import com.alexanderarend.dto.PlayerResponse;

public interface ManageCharacter {

	public PlayerResponse manageCharacterInteraction(final PlayerRequest pixelCharRequest,final PlayerResponse playerResponse );
	public boolean isDead(final int healthRemaining,final int damageDone);
	public int calculateCurrentHealth(final int healthRemaining,final int damageDone);
}
