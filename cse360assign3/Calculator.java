
package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";


	}
	
	/**Returns total*/
	public int getTotal () {
		return total;
	}
	
	/** 
	 * @param value
	 * Takes in an integer to add to total*/
	public void add (int value) {
		total = total + value;
		history = history.concat(" + " + value);
	}
	
	/** 
	 * @param value
	 * Takes in an integer to subtract from total*/
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;

	}
	
	/** 
	 * @param value
	 * Takes in an integer to multiply to total*/
	public void multiply (int value) {
		total = total * value;
		history = history.concat(" * " + value);

	}
	
	/** 
	 * @param value
	 * Takes in an integer to divide from total*/
	public void divide (int value) {
		if(value == 0){
			total = 0;
		}
		else{
		
		total = total / value;
		
		}
		
		history = history.concat(" / " + value);

	}
	/** Returns the history of operators and numbers*/
	public String getHistory () {
		
		return history;
	}

}