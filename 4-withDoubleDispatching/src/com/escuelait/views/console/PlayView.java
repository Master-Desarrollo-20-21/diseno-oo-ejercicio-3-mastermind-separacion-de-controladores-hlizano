package com.escuelait.views.console;

import com.escuelait.controllers.PlayController;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;

public class PlayView {

	public void interact(PlayController playController) {		
		Console.getInstance().writeln(Message.TITLE.toString());
		do {
			new AttemptView().write(playController);
			playController
					.setProposedCombination(new ProposedCombinationView().read(Message.PROPOSE_COMBINATION.toString()));
			playController.processProposedCombination();
		} while (!this.isGameEnded(playController));
		playController.next();
	}

	private boolean isGameEnded(PlayController playController) {
		String status = playController.gameStatus();
		if (status.equals("WIN")) {
			Console.getInstance().writeln(Message.PLAYER_WIN.toString());
			return true;
		}
		if (status.equals("LOOSE")) {
			Console.getInstance().writeln(Message.PLAYER_LOST.toString());
			return true;
		}
		return false;
	}
	
}
