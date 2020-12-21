package com.escuelait;

import com.escuelait.controllers.Logic;
import com.escuelait.views.GameView;
import com.escuelait.views.console.ConsoleGameView;

public class ConsoleMastermind extends Mastermind {

	// @Override
	// protected GameView createView(PlayController playController, ResumeController
	// resumeController) {
	// return new ConsoleGameView(playController, resumeController);
	// }

	@Override
	protected GameView createView(Logic logic) {
		return new ConsoleGameView(logic);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}



}