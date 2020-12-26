package com.escuelait.controllers;

import com.escuelait.models.Game;
import com.escuelait.models.State;

public class ResumeController extends Controller {

    public ResumeController(Game game, State state) {
        super(game, state);
    }

	public void reset() {
        game.reset();
        this.state.reset();
	}    

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
    }
    
}
