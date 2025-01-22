package com.rakesh.carroms.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.carroms.game.entities.GameDetails;
import com.rakesh.carroms.game.entities.GamePlayerDetails;
import com.rakesh.carroms.game.requestobjects.GamePlayerDetailsRO;
import com.rakesh.carroms.game.requestobjects.SaveGamePlayerDetailsRO;
import com.rakesh.carroms.game.requestobjects.StrikeLogRO;
import com.rakesh.carroms.game.responseobjects.GameSummaryResponse;

@RestController
public class GameController {

    @Autowired
    GameService gameService;

    @RequestMapping("/getSample")
    public String getResponse(){
        return "hello";
    }
    

    @RequestMapping("/startGame")
    public GameDetails startGame(@RequestParam int noOfPlayers){
        return gameService.startGame(noOfPlayers);
    }

    @RequestMapping("/saveGamePlayerDetails")
    public GamePlayerDetails savePlayerDetails(@RequestBody SaveGamePlayerDetailsRO gamePlayerDetailsRoList){
        return gameService.saveGamePlayerDetails(gamePlayerDetailsRoList.getGameId(), gamePlayerDetailsRoList.getGamePlayerDetailsRoList());
    }

    @RequestMapping("/logStrike")
    public GameSummaryResponse logStrike(@RequestBody StrikeLogRO strikeLogRO){
        gameService.logStrike(strikeLogRO);

        return null;
    }
}


