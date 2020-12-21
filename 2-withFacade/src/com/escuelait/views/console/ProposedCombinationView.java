package com.escuelait.views.console;

import com.escuelait.controllers.Logic;
import com.escuelait.models.Color;
import com.escuelait.utils.Console;
import com.escuelait.views.Message;

public class ProposedCombinationView {
	
	private Logic logic;
	
	public ProposedCombinationView(Logic logic) {
		this.logic = logic;
	}
	
	public ProposedCombinationView() {}

	public String read(String title) {
		boolean isValid = false;
		Console console = Console.getInstance();
		String proposedCombinationColors = "";
		
		do {			
			console.write(title);
			proposedCombinationColors = console.readString().toLowerCase();
			isValid = this.checkProposedCombination(proposedCombinationColors);
		}while (!isValid);
		console.writeln("");	
		return proposedCombinationColors;
	}	
	
	public boolean checkProposedCombination(String colors) {
		if (!checkLength(colors)) {
			Console.getInstance().writeln(Message.WRONG_PROPOSED_COMBINATION_LENGTH.toString());
			return false;
		}

		if (!isValidColors(colors)) {
			Console.getInstance().writeln(Message.WRONG_COLORS.toString());
			return false;
		}
		return true;
	}
	
	public static boolean checkLength(String colors) {		
		return colors.length()==4;
	}

	public static boolean isValidColors(String colors) {	
		boolean isValid = false;
		for(int i = 0; i< colors.length(); i++) {
			String color = Character.toString(colors.charAt(i));
			for(Color c : Color.values()) {
				if(c.name().equals(color)) {
					isValid = true;
				}
			}			
		}		
		return isValid;
	}

	public void write() {
		String colors = logic.getColors();
		int whites = logic.getWhites();
		int blacks = logic.getBlacks();
		Console.getInstance().writeln(colors + " --> " + blacks + " blacks " + "and " + whites + " whites");
	}

	public void setProposedCombination(int i) {
		logic.setProposedCombination(i);
	}

}
