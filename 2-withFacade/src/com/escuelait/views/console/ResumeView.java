package com.escuelait.views.console;

import com.escuelait.controllers.Logic;
import com.escuelait.utils.YesNoDialog;
import com.escuelait.views.Message;

public class ResumeView {
	
	Logic logic;

	public ResumeView(Logic logic) {
	    this.logic = logic;
	}

	public boolean isResume() {
		boolean resume = new YesNoDialog().read(Message.RESUME.toString());
		if (resume){
			this.logic.reset();
		}
		return resume;
	}
}
