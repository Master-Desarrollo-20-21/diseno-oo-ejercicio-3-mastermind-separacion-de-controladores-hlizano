package com.escuelait.controllers;

public interface ControllersVisitor {
	
	void visit(PlayController playController);
	
	void visit(ResumeController resumeController);
    
}
