/**
 * 
 * @author Enrique A. Marrero Torres
 *
 */
public class NumberPairListManager {
	private NumberPairListManager uniqueInstance = null;
	private Menu menu;
	public static void StatisticOfPairNumbers(){
		
	}
	public NumberPairListManager getInstance() {
		if (uniqueInstance==null){
			uniqueInstance = new NumberPairListManager();
			String MenuDisplay = "\n\tMenu for Lists of Pairs of Numbers: "
					+ "\n\t\t1> Show Average of Numbers of the Current List of Pairs"
					+ "\n\t\t2> Show Standard Deviation of Numbers of the Current List of Pairs"
					+ "\n\t\t3> Add more Values to the List of Pairs"
					+ "\n\t\t4> Exit"
					+ "\n\nEnter Your Selection: ";
			uniqueInstance.menu = new Menu(MenuDisplay,4,3);
		}
		return uniqueInstance;
	}
	public void run() {
		boolean exitMenu=false;
		DataSet data = new DataSet();
		data.TotalPair();
		do{
			
			uniqueInstance.menu.display();
			int choice = uniqueInstance.menu.getUserSelection();
			if (choice == 0){
				exitMenu=true;
			}
			else if(choice == 1){
				data.AveragePair();
				System.out.println("The Average of x is: "+data.getAverage());
				System.out.println("The Average of y is: "+data.getAverageY());
				
			}
			else if(choice == 2){
				data.StandardDeviationPair();
				System.out.println("The Standard Deviation of x is: "+data.getStandardDeviation());
				System.out.println("The Standard Deviation of y is: "+data.getStandardDeviationY());
			}
			else if (choice == 3){
				data.TotalPair();
			}
			else if (choice == 4){
				exitMenu=true;
			}
		}while(!exitMenu);
			
}
}
