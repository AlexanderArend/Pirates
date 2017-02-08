package com.alexanderarend.character.manage;

import org.springframework.stereotype.Component;

import com.alexanderarend.characters.Dragon;
import com.alexanderarend.characters.Gunman;
import com.alexanderarend.characters.Hydra;
import com.alexanderarend.domain.OtherUsersCoords;
import com.alexanderarend.dto.CharSelectResponse;


@Component
public class SelectCharacterImpl implements SelectCharacter {

	private static final String FIRST_PERSON_COORDS = "0,500";
	private static final String SECOND_PERSON_COORDS = "1000,500";


	public CharSelectResponse makeCharacterSelection(String userId, String charId, String charType,
			CharSelectResponse response) {
		com.alexanderarend.characters.Character character = null;
		if(charType.equals("1")){
			character = new Gunman();
		}
		else if (charType.equals("2")){
			character = new Dragon();
		}
		else if (charType.equals("3")){
			character = new Hydra();
		}
		else{

		}
		response.setCharId(charType);
		response.setUserId(response.getCharId() + userId);
		
		if(OtherUsersCoords.getAllUsersCoords().size() == 0)
			response.setCurrentLocation(FIRST_PERSON_COORDS);
		else
			response.setCurrentLocation(SECOND_PERSON_COORDS);


		response.setMovementFactor(character.getMovementFactor());
		response.setCurrentHealth(character.getMaxHealth());
		response.setMaxHealth(character.getMaxHealth());

		return response;
	}



}
