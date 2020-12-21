
package com.escuelait;

import com.escuelait.controllers.Logic;
import com.escuelait.views.GameView;

public abstract class Mastermind {
	
	private Logic logic;
	private final GameView gameView;

	protected Mastermind() {
		this.logic = new Logic();
		this.gameView = this.createView(this.logic);
	}

	public void play() {
		this.gameView.interact();		
	}

	protected abstract GameView createView(Logic logic);
}
