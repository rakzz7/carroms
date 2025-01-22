package com.rakesh.carroms.game.requestobjects;

import org.hibernate.metamodel.mapping.ForeignKeyDescriptor.Side;

import com.rakesh.carroms.game.common.SideEnum;
import com.rakesh.carroms.game.common.StrikeResultEnum;

public class StrikeLogRO {
    private int gameId;
    private GamePlayerDetailsRO gamePlayerDetailsRO;
    private Enum<StrikeResultEnum> strikeResult;
    public int getGameId() {
        return gameId;
    }
    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
    public GamePlayerDetailsRO getGamePlayerDetailsRO() {
        return gamePlayerDetailsRO;
    }
    public void setGamePlayerDetailsRO(GamePlayerDetailsRO gamePlayerDetailsRO) {
        this.gamePlayerDetailsRO = gamePlayerDetailsRO;
    }
    public Enum<StrikeResultEnum> getStrikeResult() {
        return strikeResult;
    }
    public void setStrikeResult(String strikeResult) {
        this.strikeResult = StrikeResultEnum.valueOf(strikeResult);
    }

    
}
