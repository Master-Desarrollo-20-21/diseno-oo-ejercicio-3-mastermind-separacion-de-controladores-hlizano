package com.escuelait.controllers;

import com.escuelait.models.Game;

public class ResumeController extends Controller {

    public ResumeController(Game game) {
        super(game);
    }

	public void reset() {
        game.reset();
	}
    
}
