package com.escuelait.views.console;

import com.escuelait.controllers.ProposedCombinationController;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;

public class AttemptView {

	private ProposedCombinationController proposedCombinationController;

	public AttemptView(ProposedCombinationController proposedCombinationController) {
		this.proposedCombinationController = proposedCombinationController;
	}

	public void write() {		
		int attempt = proposedCombinationController.getAttempt();
		Console.getInstance().writeln(attempt + Message.ATTEMPTS.toString());
		// Console.getInstance().write(game.getSecretCombination());			// TESTING PURPOSES
		Console.getInstance().writeln(Message.SECRET_COMBINATION.toString());
		
		for (int i = 0; i<attempt; i++) {			
			ProposedCombinationView proposedCombinationView = new ProposedCombinationView(this.proposedCombinationController);
			proposedCombinationView.setProposedCombination(i);
			proposedCombinationView.write();
		}
	}
}
