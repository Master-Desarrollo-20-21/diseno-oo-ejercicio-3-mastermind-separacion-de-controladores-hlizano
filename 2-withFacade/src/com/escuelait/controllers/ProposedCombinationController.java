package com.escuelait.controllers;

import com.escuelait.models.Game;
import com.escuelait.models.ProposedCombination;

public class ProposedCombinationController extends Controller {

    ProposedCombination proposedCombination;

    public ProposedCombinationController(Game game) {
        super(game);
        this.proposedCombination = new ProposedCombination();
    }

    public int getAttempt(){
        return game.getAttempt();
    }

	public void setProposedCombination(int i) {
		this.proposedCombination = game.getProposedCombination(i);
	}

	public String getColors() {
		return proposedCombination.getColors();
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
    
}
