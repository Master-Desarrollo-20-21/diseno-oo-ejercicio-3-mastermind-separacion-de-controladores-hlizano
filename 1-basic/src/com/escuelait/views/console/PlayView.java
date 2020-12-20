package com.escuelait.views.console;

import com.escuelait.controllers.PlayController;
import com.escuelait.controllers.ProposedCombinationController;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;


public class PlayView{

	private PlayController playController;
	private ProposedCombinationController proposedCombinationController;

	public PlayView(PlayController playController) {
		this.playController = playController;
		proposedCombinationController = new ProposedCombinationController(playController.getGame());
	}

	public void interact() {
		Console.getInstance().writeln(Message.TITLE.toString());
	    do {
			new AttemptView(this.proposedCombinationController).write();
			proposedCombinationController.setProposedCombination(new ProposedCombinationView().read(Message.PROPOSE_COMBINATION.toString()));	
			proposedCombinationController.processProposedCombination();
		}while(!this.isGameEnded());
	}

	private boolean isGameEnded() {
		
		String status = playController.gameStatus();
		if(status.equals("WIN")) {	
			Console.getInstance().writeln(Message.PLAYER_WIN.toString());
			return true;
		}
		if(status.equals("LOOSE")) {
			Console.getInstance().writeln(Message.PLAYER_LOST.toString());
			return true;
		}
		return false;
	}
}
