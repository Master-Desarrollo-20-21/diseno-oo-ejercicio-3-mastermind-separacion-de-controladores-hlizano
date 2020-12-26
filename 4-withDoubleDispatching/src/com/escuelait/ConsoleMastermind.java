package com.escuelait;

import com.escuelait.views.View;
import com.escuelait.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {

	@Override
	protected View createView() {
		return new ConsoleView();
	}

	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

}