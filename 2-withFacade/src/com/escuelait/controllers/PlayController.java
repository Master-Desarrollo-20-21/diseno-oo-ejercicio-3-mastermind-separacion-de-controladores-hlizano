package com.escuelait.controllers;

import com.escuelait.models.Game;
import com.escuelait.models.ProposedCombination;

public class PlayController extends Controller {
    
    public PlayController(Game game) {
		super(game);		
    }

	public String gameStatus() {
		return game.gameStatus();
	}

	public Game getGame(){
		return game;
	}

}
