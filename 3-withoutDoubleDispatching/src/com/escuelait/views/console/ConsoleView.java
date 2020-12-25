package com.escuelait.views.console;

import com.escuelait.controllers.Controller;
import com.escuelait.controllers.PlayController;
import com.escuelait.controllers.ResumeController;
import com.escuelait.views.View;

public class ConsoleView implements View {

    private PlayView playView;
    private ResumeView resumeView;

    public ConsoleView() {
        this.playView = new PlayView();
        this.resumeView = new ResumeView();
    }

    @Override
    public void interact(Controller controller) {
        if (controller instanceof PlayController) {
            this.playView.interact((PlayController) controller);
        } else {
            if (controller instanceof ResumeController) {
                this.resumeView.isResume((ResumeController) controller);
            }            
        }
    }

}
