package com.alexanderarend.rest.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alexanderarend.dto.PlayerRequest;
import com.alexanderarend.dto.PlayerResponse;

@RestController
@RequestMapping("/play")
public class DirectUserInteractionsEndpoint {
	RequestMapping(value = "/move" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<PlayerResponse> playerInteraction(@RequestBody final PlayerRequest playerRequest) {

	}
}
