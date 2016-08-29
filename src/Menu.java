
public class Menu {
	private String content;
	// All the content of the menu display as a String. 
	private int nOptions;
	// Number of options in menu. These are values: 1, ..., nOptions. 
	private int maxChances;
	// Max number of opportunities that this menu gives to its users the enter a valid 
	// selection. 
	public Menu(String content, int nOptions, int maxChances) {
		this.content= content;
		this.nOptions= nOptions;
		this.maxChances= maxChances;
	}
	public void display() {
		ProjectUtils.println(content);
	}
	/**
	 Asks for and reads the user's selection. 
	 @return Returns 0 if all the attempts allowed have been
	 used by the user, without entering a valid selection.
	 Otherwise, it returns the integer value corresponding to
	 the valid selection by the user.
	 */
	public int getUserSelection() {
		int opportunity= 0;
		boolean valid= false;
		int selection= 0;
		while(!valid && opportunity < maxChances)
		{
			opportunity++;
			ProjectUtils.println("\n\nEnter valid selection for this menu: ");
			selection= ProjectUtils.readInteger();
			if (selection>=1 && selection<= nOptions) 
				valid= true;
			
		}
		if (!valid)
				return 0;
		else
				return selection;
		
	}
		/**
		 Get the int value representing the exit option in the menu
		 @return the int value corresponding to the exit option
		 */	
	public int getExitChoice(){
		return nOptions;
	}
}
			

	

