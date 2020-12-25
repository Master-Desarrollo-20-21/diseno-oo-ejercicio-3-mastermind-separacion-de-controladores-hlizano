
package com.escuelait;

import com.escuelait.controllers.Controller;
import com.escuelait.controllers.Logic;
import com.escuelait.views.View;

public abstract class Mastermind {
	
	private Logic logic;
	private final View view;

	protected Mastermind() {
		this.logic = new Logic();
		this.view = this.createView();
	}

	protected void play() {
        Controller controller;
        do {
            controller = this.logic.getController();
            if (controller != null) {
                this.view.interact(controller);
            }
        } while (controller != null);
    }

	protected abstract View createView();
}
