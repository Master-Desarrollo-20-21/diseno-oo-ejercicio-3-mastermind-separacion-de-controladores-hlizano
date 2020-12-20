package com.escuelait.views.console;

import com.escuelait.controllers.ResumeController;
import com.escuelait.utils.YesNoDialog;
import com.escuelait.views.Message;

public class ResumeView {
	
	private ResumeController resumeController;

	public ResumeView(ResumeController resumeController) {
	    this.resumeController = resumeController;
	}

	public boolean isResume() {
		boolean resume = new YesNoDialog().read(Message.RESUME.toString());
		if (resume){
			this.resumeController.reset();
		}
		return resume;
	}
}
