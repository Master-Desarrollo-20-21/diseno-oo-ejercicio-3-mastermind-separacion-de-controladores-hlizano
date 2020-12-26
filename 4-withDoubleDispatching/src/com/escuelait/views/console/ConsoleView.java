package com.escuelait.views.console;

import com.escuelait.controllers.PlayController;
import com.escuelait.controllers.ResumeController;
import com.escuelait.views.View;

public class ConsoleView extends View {

    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView() {
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    public void visit(PlayController playController) {
        this.playView.interact(playController);
    }

    public void visit(ResumeController resumeController) {
        this.resumeView.isResume(resumeController);
    }

}
