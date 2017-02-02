package com.alexanderarend.character.manage;

import com.alexanderarend.coords.Coordinates;
import com.alexanderarend.coords.MoveCoords;
import com.alexanderarend.domain.OtherUsersCoords;
import com.alexanderarend.dto.MoveCharacterRequest;
import com.alexanderarend.dto.MoveCharacterResponse;
import com.alexanderarend.parse.ParseCoords;


public class MoveCharacterImpl implements MoveCharacter{

	public MoveCharacterResponse move(MoveCharacterRequest moveCharRequest) {
		MoveCharacterResponse response = new MoveCharacterResponse();
		Coordinates cords = ParseCoords.parseCoordinates(moveCharRequest.getCoordinates());
		String coords = MoveCoords.changeCoords(cords, moveCharRequest.getDirection(), moveCharRequest.getMovementTypeFactor()).toString();
		response.setNewCoordinates(coords);

		response.setUserId(moveCharRequest.getUserId());
		OtherUsersCoords.addOrUpdateCoords(moveCharRequest.getUserId(), coords);
		return response;

	}

}
