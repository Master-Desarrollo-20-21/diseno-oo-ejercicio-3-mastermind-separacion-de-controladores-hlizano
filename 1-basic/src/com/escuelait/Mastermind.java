
package com.escuelait;

import com.escuelait.controllers.PlayController;
import com.escuelait.controllers.ResumeController;
import com.escuelait.models.Game;
import com.escuelait.views.GameView;

public abstract class Mastermind {
	
	private Game game;
    private final PlayController playController;
	private final ResumeController resumeController;
	private final GameView gameView;

	protected Mastermind() {
		this.game = new Game();
		this.playController = new PlayController(this.game);
		this.resumeController = new ResumeController(this.game);
		this.gameView = this.createView(this.playController, this.resumeController);
	}

	public void play() {
		this.gameView.interact();		
	}

	protected abstract GameView createView(PlayController playController, ResumeController resumeController);
}
