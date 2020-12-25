package com.escuelait.views.console;

import com.escuelait.controllers.PlayController;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;

public class AttemptView {

	public void write(PlayController playController) {		
		int attempt = playController.getAttempt();
		Console.getInstance().writeln(attempt + Message.ATTEMPTS.toString());
		Console.getInstance().writeln(Message.SECRET_COMBINATION.toString());
		
		for (int i = 0; i<attempt; i++) {			
			ProposedCombinationView proposedCombinationView = new ProposedCombinationView(playController);
			proposedCombinationView.getProposedColors(i);
			proposedCombinationView.write();
		}
	}
}
