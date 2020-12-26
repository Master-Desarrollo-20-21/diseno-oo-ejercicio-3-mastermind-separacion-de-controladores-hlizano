package com.escuelait.views;

import com.escuelait.controllers.Controller;
import com.escuelait.controllers.ControllersVisitor;

public abstract class View implements ControllersVisitor {

	public void interact(Controller controller){
        controller.accept(this);
    }

}
