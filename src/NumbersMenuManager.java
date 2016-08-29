/**
 * 
 * @author Enrique A. Marrero Torres
 *
 */
public class NumbersMenuManager {

	private Menu menu;
	private static NumbersMenuManager uniqueInstance = null;
	public static NumbersMenuManager getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new NumbersMenuManager();
			String menuDisplay = "\n\tMenu for Numbers: "
					+ "\n\t\t1> Process Quadratic Equation"
					+ "\n\t\t2> Compute Statistics of Lists of Numbers"
					+ "\n\t\t3> Compute Statistics of Lists of Pairs of Numbers"
					+ "\n\t\t4> Exit"
					+ "\n\n\tEnter your Selection: ";
					
					
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
				exitMenu=true;
			}
			else if (choice ==1){
				ProjectUtils.processQuadraticEquation();
			}
			else if (choice==2){
				ProjectUtils.NumberList();
			}
			else if (choice==3){
				ProjectUtils.NumberPairList();
			}
			else if (choice==4){
				exitMenu=true;
			}
		
		}while (!exitMenu);
	}
}
