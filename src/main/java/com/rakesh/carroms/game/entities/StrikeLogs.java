package com.rakesh.carroms.game.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StrikeLogs {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int strikeId;

    private int gameId;

    private String side;

    private int playerNumber;

    private String strikeResult;

    public int getStrikeId() {
        return strikeId;
    }

    public void setStrikeId(int strikeId) {
        this.strikeId = strikeId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getStrikeResult() {
        return strikeResult;
    }

    public void setStrikeResult(String strikeResult) {
        this.strikeResult = strikeResult;
    }

    

}
