package com.escuelait.controllers;

import com.escuelait.models.Game;
import com.escuelait.models.State;
import com.escuelait.models.StateValue;

import java.util.HashMap;
import java.util.Map;

public class Logic {
    
    private final Game game;
    private final State state;
    private final Map<StateValue, Controller> controllers;

    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.IN_GAME, new PlayController(this.game, this.state));        
        this.controllers.put(StateValue.RESUME, new ResumeController(this.game, this.state));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }

}
