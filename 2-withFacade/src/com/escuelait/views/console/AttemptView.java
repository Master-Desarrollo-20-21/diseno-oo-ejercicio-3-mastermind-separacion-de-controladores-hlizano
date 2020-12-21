package com.escuelait.views.console;

import com.escuelait.controllers.Logic;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;

public class AttemptView {

	Logic logic;;

	public AttemptView(Logic logic) {
		this.logic = logic;
	}

	public void write() {		
		int attempt = logic.getAttempt();
		Console.getInstance().writeln(attempt + Message.ATTEMPTS.toString());
		// Console.getInstance().write(game.getSecretCombination());			// TESTING PURPOSES
		Console.getInstance().writeln(Message.SECRET_COMBINATION.toString());
		
		for (int i = 0; i<attempt; i++) {			
			ProposedCombinationView proposedCombinationView = new ProposedCombinationView(this.logic);
			proposedCombinationView.setProposedCombination(i);
			proposedCombinationView.write();
		}
	}
}
