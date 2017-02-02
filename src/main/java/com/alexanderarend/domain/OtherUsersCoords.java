package com.alexanderarend.domain;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class OtherUsersCoords {
	
	private static ConcurrentHashMap<String, String> currentUsersCoords  = new ConcurrentHashMap<String,String>();

	private OtherUsersCoords(){
	}

	public static void addOrUpdateCoords(String userId, String coords){
		currentUsersCoords.put(userId, coords);

	}

	public static void removeCoordsFromList(String userId){
		currentUsersCoords.remove(userId);
	}
	
	public static Map<String, String> getAllUsersCoords(){
		return currentUsersCoords;
	}

}
