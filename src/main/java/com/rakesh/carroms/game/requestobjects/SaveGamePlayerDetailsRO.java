package com.rakesh.carroms.game.requestobjects;

import java.util.List;

public class SaveGamePlayerDetailsRO {
    private int gameId;
    private List<GamePlayerDetailsRO> gamePlayerDetailsRoList;
    public int getGameId() {
        return gameId;
    }
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
    public List<GamePlayerDetailsRO> getGamePlayerDetailsRoList() {
        return gamePlayerDetailsRoList;
    }
    public void setGamePlayerDetailsRoList(List<GamePlayerDetailsRO> gamePlayerDetailsRoList) {
        this.gamePlayerDetailsRoList = gamePlayerDetailsRoList;
    }
    
}
