package com.alexanderarend.rest.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alexanderarend.character.manage.ManageCharacterImpl;
import com.alexanderarend.character.manage.MoveCharacterImpl;
import com.alexanderarend.character.manage.SelectCharacterImpl;
import com.alexanderarend.dto.CharSelectResponse;
import com.alexanderarend.dto.MoveCharacterRequest;
import com.alexanderarend.dto.MoveCharacterResponse;
import com.alexanderarend.dto.PlayerRequest;
import com.alexanderarend.dto.PlayerResponse;


@RestController
@RequestMapping("/interaction")
public class CharacterInteractionEndpoint {
	
	@Autowired
	ManageCharacterImpl manageChar;
	
	@Autowired
	SelectCharacterImpl selectChar;
	
	@Autowired
	MoveCharacterImpl moveChar;
	
	@RequestMapping(value = "/interact" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<PlayerResponse> playerInteraction(@RequestBody final PlayerRequest playerRequest) {
		
		return new ResponseEntity<PlayerResponse>(manageChar.manageCharacterInteraction(playerRequest, new PlayerResponse()), HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(value = "/move" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<MoveCharacterResponse> playerInteraction(@RequestBody final MoveCharacterRequest moveCharRequest) {
		
		return new ResponseEntity<MoveCharacterResponse>(moveChar.move(moveCharRequest), HttpStatus.ACCEPTED);
	}
	
	
	@RequestMapping( value = "/select", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<CharSelectResponse>  getStatus(@RequestParam final String userId, @RequestParam final String charId, @RequestParam final String charType ) {
	
		return new ResponseEntity<CharSelectResponse>(selectChar.makeCharacterSelection(userId, charId, charType, new CharSelectResponse()), HttpStatus.ACCEPTED);
	}
	

}
