/**
 * 
 * @author Enrique A. Marrero Torres
 *
 */
public class NumberListManager {
	private Menu menu;
	private static NumberListManager uniqueInstance = null;

	
	public  NumberListManager getInstance() {
		if (uniqueInstance==null){
			uniqueInstance = new NumberListManager();
			String MenuDisplay = "\n\tMenu for Lists of Numbers: "
					+ "\n\t\t1> Show Average of Numbers in the Current List"
					+ "\n\t\t2> Show Standard Deviation of Numbers in the Current List"
					+ "\n\t\t3> Add more Values to the List"
					+ "\n\t\t4> Exit"
					+ "\n\nEnter Your Selection: ";
			uniqueInstance.menu = new Menu(MenuDisplay,4,3);
		}
		return uniqueInstance;
	}
	public void run() {
		boolean exitMenu=false;
		DataSet data = new DataSet();
		data.Total();
		do{
			uniqueInstance.menu.display();
			int choice = uniqueInstance.menu.getUserSelection();
			if (choice == 0){
				exitMenu=true;
			}
			else if(choice == 1){
				data.Average();
				System.out.println("The Average is: "+ data.getAverage());
			}
			else if(choice == 2){
				data.StandardDeviation();
				System.out.println("The Standard Deviation is: "+ data.getStandardDeviation());
			}
			else if (choice == 3){
				data.Total();
			}
			else if (choice == 4){
				exitMenu=true;
			}
		}while(!exitMenu);
			
	}
}
