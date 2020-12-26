package com.escuelait.controllers;

import com.escuelait.models.Game;
import com.escuelait.models.ProposedCombination;
import com.escuelait.models.State;

public class PlayController extends Controller {

	ProposedCombination proposedCombination;

    
    public PlayController(Game game, State state) {
		super(game, state);		
		this.proposedCombination = new ProposedCombination();
    }

	public String gameStatus() {
		return game.gameStatus();
	}

	public Game getGame(){
		return game;
	}

	/*esto iba en ProposedCombinationController*/

	  public int getAttempt(){
        return game.getAttempt();
    }

	public void getProposedColors(int i) {
		this.proposedCombination = game.getProposedColors(i);
	}

	public String getProposedColors() {
		return proposedCombination.getProposedColors();
	}

	public int getWhites() {
		return proposedCombination.getWhites();
	}

	public int getBlacks() {
		return proposedCombination.getBlacks();
	}

	public void setProposedCombination(String read) {
        proposedCombination = new ProposedCombination(read);
	}
    
    public void processProposedCombination() {
        game.processProposedCombination(proposedCombination);
    }

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}

}
