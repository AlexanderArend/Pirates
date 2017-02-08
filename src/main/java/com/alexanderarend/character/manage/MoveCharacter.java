package com.alexanderarend.character.manage;

import com.alexanderarend.dto.MoveCharacterRequest;
import com.alexanderarend.dto.MoveCharacterResponse;

public interface MoveCharacter {

	public MoveCharacterResponse move(MoveCharacterRequest moveCharRequest);

}
