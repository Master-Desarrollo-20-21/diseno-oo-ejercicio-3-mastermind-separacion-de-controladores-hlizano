package com.escuelait.views;

import com.escuelait.controllers.Logic;

public abstract class GameView {

	protected Logic logic;

	protected GameView(Logic logic) {
        this.logic = logic;
	}

	public void interact() {
		do {
			this.play();
		} while (this.isResume());
	}
		
    protected abstract void play();

    protected abstract boolean isResume();

}
