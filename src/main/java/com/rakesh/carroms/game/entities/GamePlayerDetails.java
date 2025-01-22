package com.rakesh.carroms.game.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class GamePlayerDetails {

    @Id
    private int gameId;
    
    private String whitePlayer1;

    private String blackPlayer1;

    private String whitePlayer2;

    private String blackPlayer2;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getWhitePlayer1() {
        return whitePlayer1;
    }

    public void setWhitePlayer1(String whitePlayer1) {
        this.whitePlayer1 = whitePlayer1;
    }

    public String getBlackPlayer1() {
        return blackPlayer1;
    }

    public void setBlackPlayer1(String blackPlayer1) {
        this.blackPlayer1 = blackPlayer1;
    }

    public String getWhitePlayer2() {
        return whitePlayer2;
    }

    public void setWhitePlayer2(String whitePlayer2) {
        this.whitePlayer2 = whitePlayer2;
    }

    public String getBlackPlayer2() {
        return blackPlayer2;
    }

    public void setBlackPlayer2(String blackPlayer2) {
        this.blackPlayer2 = blackPlayer2;
    }

    


}
