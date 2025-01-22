package com.rakesh.carroms.game.requestobjects;

import com.rakesh.carroms.game.common.SideEnum;

public class GamePlayerDetailsRO {
    private int gameId;
    private String playerName;
    private Enum<SideEnum> playerSide;
    private int playerOrder;
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public Enum<SideEnum> getPlayerSide() {
        return playerSide;
    }
    public void setPlayerSide(String playerSide) {
        this.playerSide = SideEnum.valueOf(playerSide);
    }
    public int getPlayerOrder() {
        return playerOrder;
    }
    public void setPlayerOrder(int playerOrder) {
        this.playerOrder = playerOrder;
    }
    public int getGameId() {
        return gameId;
    }
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
    
    
}
