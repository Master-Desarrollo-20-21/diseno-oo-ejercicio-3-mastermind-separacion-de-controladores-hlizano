package com.escuelait.views;

import com.escuelait.controllers.PlayController;
import com.escuelait.controllers.ResumeController;

public abstract class GameView {

    protected PlayController playController;
    protected ResumeController resumeController;

	protected GameView(PlayController playController, ResumeController resumeController) {
        this.playController = playController;
        this.resumeController = resumeController;
	}

	public void interact() {
		do {
			this.play();
		} while (this.isResume());
	}
		
    protected abstract void play();

    protected abstract boolean isResume();

}
