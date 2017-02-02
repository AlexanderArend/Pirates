package com.alexanderarend.rest.impl;

import java.util.UUID;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alexanderarend.attack.CoordinateAttackImpl;
import com.alexanderarend.dto.AttackRequest;
import com.alexanderarend.dto.AttackResponse;



@RestController
@RequestMapping("/attack")
public class AttackEndpoint{
	
	@Autowired
	CoordinateAttackImpl attack;
	
	@RequestMapping(value = "/attack" , method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<AttackResponse> startJob(@RequestBody final AttackRequest attackRequest) {
	
		return new ResponseEntity<AttackResponse>(attack.implementAttack(attackRequest, new AttackResponse()), HttpStatus.ACCEPTED);
	}



}
