package com.escuelait;

import com.escuelait.controllers.PlayController;
import com.escuelait.controllers.ResumeController;
import com.escuelait.views.GameView;
import com.escuelait.views.console.ConsoleGameView;


public class ConsoleMastermind extends Mastermind{

	@Override
	protected GameView createView(PlayController playController, ResumeController resumeController) {		
		return new ConsoleGameView(playController, resumeController);
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}