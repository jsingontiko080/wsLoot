package com.loot.server.api.service;

import com.loot.server.api.domain.GameCreationDto;

public interface GameService {
    
    String generateRoomKey();

    GameCreationDto getRoomKeyForNewGame();

    Boolean isValidRoomKey(String roomKey);

}
