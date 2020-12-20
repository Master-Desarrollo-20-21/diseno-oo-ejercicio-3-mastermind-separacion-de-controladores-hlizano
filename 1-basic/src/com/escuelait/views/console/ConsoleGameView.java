package com.escuelait.views.console;

import com.escuelait.controllers.PlayController;
import com.escuelait.controllers.ResumeController;
import com.escuelait.views.GameView;

public class ConsoleGameView extends GameView{

    private PlayView playView;
	private ResumeView resumeView;
	
	public ConsoleGameView(PlayController playController, ResumeController resumeController) {
		super(playController, resumeController);
		this.playView = new PlayView(playController);	
		this.resumeView = new ResumeView(resumeController);
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
