package com.escuelait.views.console;

import com.escuelait.controllers.ResumeController;
import com.escuelait.utils.Console;
import com.escuelait.utils.YesNoDialog;
import com.escuelait.views.Message;

public class ResumeView {

	public void isResume(ResumeController resumeController) {
		boolean resume = new YesNoDialog().read(Message.RESUME.toString());
		if (resume){
			resumeController.reset();
		}
		else{
			Console.getInstance().writeln(Message.GAME_OVER.toString());
			resumeController.next();
		}
			
	}
}
