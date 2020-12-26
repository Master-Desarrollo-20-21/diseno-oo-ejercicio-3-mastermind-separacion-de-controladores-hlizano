package com.escuelait.models;

public class Combination {
	
	protected String proposedColors;

	private static final int WIDTH = 4;
	public Combination() {
		proposedColors = "";
	}
	
	public Combination(String proposedColors) {
		this.proposedColors = proposedColors;
	}

	public String getProposedColors() {
		return proposedColors;
	}
	
    public int getWidth() {
        return Combination.WIDTH;
    }
}
