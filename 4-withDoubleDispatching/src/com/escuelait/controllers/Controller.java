package com.escuelait.controllers;

import com.escuelait.models.Game;
import com.escuelait.models.State;

public abstract class Controller {
    
    protected Game game;
    protected State state;

    Controller(Game game, State state) {
        this.game = game;
        this.state = state;
    }

    public void next() {
        this.state.next();
    }

    public abstract void accept(ControllersVisitor controllersVisitor);
    
}
