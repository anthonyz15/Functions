

public class MainMenuManager  {
private static MainMenuManager uniqueInstance = null;
private Menu menu;
private MainMenuManager(){

}
public static MainMenuManager getInstance(){
	if (uniqueInstance == null){
		uniqueInstance = new MainMenuManager();
		String menuDisplay = "\n\tMain Menu: "
				+ "\n\t\t1> Perform Operations on Numbers"
				+ "\n\t\t2> Perform Operations on Strings"
				+ "\n\t\t3> Show Use Statistics"
				+ "\n\t\t4> Exit Program" + "\n"
				+ "\n\n\tEnter your selection: "; 
				
				//Create a menu object as per the specifications of the main
				//menu. Notice that it displays the above string, it has 4 options
				//and for the user to select a valid option, we have established
				//a maximum of 3 opportunities.
				uniqueInstance.menu = new Menu(menuDisplay, 4, 3);
				
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
			ProjectUtils.operationsOnNumbers();
		}
		else if (choice==2){
			ProjectUtils.operationsOnStrings();
		}
		else if (choice==3){
			ProjectUtils.showStatistics();
		}
		else if (choice==4){
			exitMenu = true;
		}
	}while (!exitMenu);
}
}