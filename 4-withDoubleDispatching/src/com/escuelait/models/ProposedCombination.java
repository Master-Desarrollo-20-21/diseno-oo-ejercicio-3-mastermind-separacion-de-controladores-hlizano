package com.escuelait.models;

public class ProposedCombination extends Combination {

	private int whites;
	private int blacks;
	
	public ProposedCombination(String colors, int blacks, int whites) {
		this.proposedColors = colors;
		this.blacks = blacks;
		this.whites = whites;
	}

	public ProposedCombination() {
		this.proposedColors = "";
		this.blacks = 0;
		this.whites = 0;
	}

	public ProposedCombination(String proposedColors) {
		this.proposedColors = proposedColors;
	}

	public int getWhites() {
		return this.whites;
	}
	
	public int getBlacks() {
		return this.blacks;
	}
	
	public void setWhites(int whites) {
		this.whites = whites;
	}
	
	public void setBlacks(int blacks) {
		this.blacks = blacks;
	}
	
	public void setProposedCombinationColors(String proposedColors) {
		this.proposedColors = proposedColors;
	}

	public boolean isWinner() {
		return this.getBlacks() == this.getWidth();				
	}

}
