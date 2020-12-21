package com.escuelait.views.console;

import com.escuelait.controllers.Logic;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;


public class PlayView{

	Logic logic;

	public PlayView(Logic logic) {
		this.logic = logic;
	}

	public void interact() {
		Console.getInstance().writeln(Message.TITLE.toString());
	    do {
			new AttemptView(this.logic).write();
			logic.setProposedCombination(new ProposedCombinationView().read(Message.PROPOSE_COMBINATION.toString()));	
			logic.processProposedCombination();
		}while(!this.isGameEnded());
	}

	private boolean isGameEnded() {
		
		String status = logic.gameStatus();
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
