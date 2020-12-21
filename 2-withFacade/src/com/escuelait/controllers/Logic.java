package com.escuelait.controllers;

import com.escuelait.models.Game;

public class Logic {
    
    private Game game;
    private PlayController playController;
    private ResumeController resumeController;
    private ProposedCombinationController proposedCombinationController;

    public Logic() {
        this.game = new Game();
        this.playController = new PlayController(this.game);
        this.resumeController = new ResumeController(this.game);
        this.proposedCombinationController = new ProposedCombinationController(game);
    }

    public String gameStatus() {
		return playController.gameStatus();
	}

	public Game getGame(){
		return playController.getGame();
    }

    public void reset() {
        resumeController.reset();
	}
    
    public int getAttempt(){
        return proposedCombinationController.getAttempt();
    }

	public void setProposedCombination(int i) {
		proposedCombinationController.setProposedCombination(i);
	}

	public String getColors() {
		return proposedCombinationController.getColors();
	}

	public int getWhites() {
		return proposedCombinationController.getWhites();
	}

	public int getBlacks() {
		return proposedCombinationController.getBlacks();
	}

	public void setProposedCombination(String read) {
        proposedCombinationController.setProposedCombination(read);
	}
    
    public void processProposedCombination() {
        proposedCombinationController.processProposedCombination();
    }

}
