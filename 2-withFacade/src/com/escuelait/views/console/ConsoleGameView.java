package com.escuelait.views.console;

import com.escuelait.controllers.Logic;
import com.escuelait.views.GameView;

public class ConsoleGameView extends GameView{

    private PlayView playView;
	private ResumeView resumeView;
	
	public ConsoleGameView(Logic logic) {
		super(logic);
		this.playView = new PlayView(this.logic);	
		this.resumeView = new ResumeView(this.logic);
	}

    @Override
    protected void play() {
        this.playView.interact();
    }

    @Override
    protected boolean isResume() {
        return this.resumeView.isResume();
    }    
}
