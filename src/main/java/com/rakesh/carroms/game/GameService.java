package com.rakesh.carroms.game;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.carroms.game.common.SideEnum;
import com.rakesh.carroms.game.dao.GameDetailsDao;
import com.rakesh.carroms.game.dao.GamePlayerDetailsDao;
import com.rakesh.carroms.game.dao.StrikeLogsDao;
import com.rakesh.carroms.game.entities.GameDetails;
import com.rakesh.carroms.game.entities.GamePlayerDetails;
import com.rakesh.carroms.game.entities.StrikeLogs;
import com.rakesh.carroms.game.requestobjects.GamePlayerDetailsRO;
import com.rakesh.carroms.game.requestobjects.StrikeLogRO;

@Service
public class GameService {

    @Autowired
    GameDetailsDao gameDetailsDao;

    @Autowired
    GamePlayerDetailsDao gamePlayerDetailsDao;

    @Autowired
    StrikeLogsDao strikeLogsDao;

    public GameDetails startGame(int noOfPlayers) {
        GameDetails gameDetails = new GameDetails();
        gameDetails.setNoOfPlayers(noOfPlayers);
        gameDetails.setStarTimestamp(Timestamp.from(Instant.now()));
        return gameDetailsDao.save(gameDetails);
    }

    public GamePlayerDetails saveGamePlayerDetails(int gameId,List<GamePlayerDetailsRO> gamePlayerDetailsRoList) {
        String whitePlayer1 = gamePlayerDetailsRoList.stream()
                .filter(playerDetails -> playerDetails.getPlayerSide().equals(SideEnum.WHITES)
                        && playerDetails.getPlayerOrder() == 1)
                .findFirst().get().getPlayerName();

        String whitePlayer2 = gamePlayerDetailsRoList.stream()
                .filter(playerDetails -> playerDetails.getPlayerSide().equals(SideEnum.WHITES)
                        && playerDetails.getPlayerOrder() == 2)
                .findFirst().get().getPlayerName();
        String blackPlayer1 = gamePlayerDetailsRoList.stream()
                .filter(playerDetails -> playerDetails.getPlayerSide().equals(SideEnum.BLACKS)
                        && playerDetails.getPlayerOrder() == 1)
                .findFirst().get().getPlayerName();
        String blackPlayer2 = gamePlayerDetailsRoList.stream()
                .filter(playerDetails -> playerDetails.getPlayerSide().equals(SideEnum.BLACKS)
                        && playerDetails.getPlayerOrder() == 2)
                .findFirst().get().getPlayerName();

        GamePlayerDetails gamePlayerDetails = new GamePlayerDetails();
        gamePlayerDetails.setGameId(gameId);
        gamePlayerDetails.setWhitePlayer1(whitePlayer1);
        gamePlayerDetails.setWhitePlayer2(whitePlayer2);
        gamePlayerDetails.setBlackPlayer1(blackPlayer1);
        gamePlayerDetails.setBlackPlayer2(blackPlayer2);
        return gamePlayerDetailsDao.save(gamePlayerDetails);
    }

    public void logStrike(StrikeLogRO strikeLogRO) {

        StrikeLogs strikeLogs = new StrikeLogs();
        strikeLogs.setGameId(strikeLogRO.getGameId());
        strikeLogs.setPlayerNumber(strikeLogRO.getGamePlayerDetailsRO().getPlayerOrder());
        strikeLogs.setSide(strikeLogRO.getGamePlayerDetailsRO().getPlayerSide().toString());
        strikeLogs.setStrikeResult(strikeLogRO.getStrikeResult().toString());
        strikeLogsDao.save(strikeLogs);

        List<StrikeLogs> strikeLogsList = strikeLogsDao.findAllBySide("WHITES");
        // strikeLogsList.stream().filter(log -> log.getStrikeResult())

    }

}
