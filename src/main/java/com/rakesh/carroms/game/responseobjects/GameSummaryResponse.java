package com.rakesh.carroms.game.responseobjects;

public class GameSummaryResponse {
    private int noOfBlackCoins;
    private int noOfWhiteCoins;
    private String turn;
    private boolean isCompleted;
    private String responseMessage;
    public int getNoOfBlackCoins() {
        return noOfBlackCoins;
    }
    public void setNoOfBlackCoins(int noOfBlackCoins) {
        this.noOfBlackCoins = noOfBlackCoins;
    }
    public int getNoOfWhiteCoins() {
        return noOfWhiteCoins;
    }
    public void setNoOfWhiteCoins(int noOfWhiteCoins) {
        this.noOfWhiteCoins = noOfWhiteCoins;
    }
    public String getTurn() {
        return turn;
    }
    public void setTurn(String turn) {
        this.turn = turn;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
    public String getResponseMessage() {
        return responseMessage;
    }
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    
}
