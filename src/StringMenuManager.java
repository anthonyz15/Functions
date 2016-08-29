/**
 * 
 * @author Enrique A. Marrero Torres
 *
 */
public class StringMenuManager {
	

	
	private Menu menu;
	private static StringMenuManager uniqueInstance = null;
	public static StringMenuManager getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new StringMenuManager();
			String menuDisplay = "\n\tMenu for String management: "
					+ "\n\t\t1> Encrypt/Decrypt Strings"
					+ "\n\t\t2> Show Words on Given Strings"
					+ "\n\t\t3> Exit"
					+ "\n\n\tEnter your Selection: ";
					
					
					//Create a menu object as per the specifications of the main
					//menu. Notice that it displays the above string, it has 4 options
					//and for the user to select a valid option, we have established
					//a maximum of 3 opportunities.
					uniqueInstance.menu = new Menu(menuDisplay, 3, 2);
					
		}
		return uniqueInstance;
	}
	public void run(){
		boolean exitMenu = false;
		do{
			menu.display();
			int choice = menu.getUserSelection();
			//the above method call will return 0 if the user did not
			//enter a valid selection in the opportunities given...
			//Otherwise, it is valid.
			if (choice==0){
				//here the user can be informed that fail to enter a
				//valid input after all the opportunities given...
				//for the moment, just exit...
				exitMenu=true;
			}
			else if (choice ==1){
				//here goes your code to initiate the action associated with the
				//menu option 1...
				ProjectUtils.encryptAString();
			}
			else if (choice==2){
				ProjectUtils.wordsInAString();
			}
			else if (choice==3){
				exitMenu=true;
			}
		
		}while (!exitMenu);
	}
}