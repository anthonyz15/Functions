/**
 * 
 * @author Enrique A. Marrero Torres
 */
import java.util.Scanner;
public class ProjectUtils {
	
	static int count1=0;
	static int count2=0;
	static int count3=0;
	static int count4=0;
	static int count5=0;
	static int count6=0;
	

	
	//the unique Scanner object to be used for input from
	//the user throughout the program.
	private static final Scanner input= new Scanner(System.in);
	private static Scanner in;
	private static Scanner in2;
	private static Scanner in3;
	
	//Method for reading and returning an integer value
	public static int readInteger(){
		//for the moment, just assume that the input is a
		//valid integer... but eventually we want to be
		//more robust and explicitly read and test first if
		//the input was really an integer or not...
		return input.nextInt();
	}
	
	public static String readString()
	{
		return input.nextLine();

	}
	public static String readStringNow(){
		return input.next();
	}
	public static float readFloat(){
		return input.nextFloat();
	}
	public static double readDouble(){
		return input.nextDouble();
	}
	public static boolean readhasDouble(double x)
	{
		return input.hasNextDouble();
	}
	//TODO: ...methods to read other types of inputs as needed...
	
	//Methods for output
	public static void print(String s){
		System.out.print(s);
	}
	public static void println(String s){
		System.out.println(s);
	}
	/**
	 * initiates the execution of the menu for operations with numbers.
	 * This is to be executed each time the user selects option 1 in main
	 * menu.
	 */
public static void operationsOnNumbers(){
	NumbersMenuManager numbersMenuManager = NumbersMenuManager.getInstance();
	numbersMenuManager.run();
	
}


/**
 * Initiates the execution of the menu for operations with strings.
 * This is to be executed each time the user selects option 2 in main
 * menu.
 */
public static void operationsOnStrings(){
	StringMenuManager stringMenuManager = StringMenuManager.getInstance();
	stringMenuManager.run();
}
/**
 * Method to show statistics of usage. Executed whenever the user selects
 * option 3 in main menu as per the specifications at the moment.
 */
public static void showStatistics() {
	System.out.println("Show Statistics"); 
	// TODO: add necessary code....
	System.out.println("\nShow Statistics\n");
	System.out.println("Operation in the program\t\tNumber of Times Executed"
			+ "\n====================================\t\t========================"
			+ "\nProcess a Quadratic Equation                         \t\t" + count1
			+ "\nCompute Statistics of List of Numbers                \t\t" + count2
			+ "\nCompute Satistics of Lists of Pairs of Numbers       \t\t" + count3
			+ "\nEncrypt/Decrypt strings                              \t\t" + count4
			+ "\nExtract Words from Strings     				      \t\t" + count5
			+ "\nShow Statistics 									  \t\t" + count6);

	count6++;

}
/**
 * Method to initiate the actions to read and encrypt a string.
 */
public static void encryptAString(){
	System.out.println("Encrypting a string");
	in = new Scanner (System.in);

	print("Please enter your sentence: ");
	String s1=in.nextLine();
	print("\nPlease enter your Password ranging from -25 to 25: ");
	int k1=in.nextInt();
	String s = StringEncryptor.encryptString(s1,k1);
	print(s);
	print("\n");
	print("Want to decypher string?, enter (y) for yes and (n) for no: \n");
	String choice=in.next();
	String Y="y";
	if (choice.equals(Y))
	{
		s=StringEncryptor.encryptString(s, -k1);
		print("\n");
		print(s);
	}
	count4++;
}
/**
 * Method to initiate the actions to read a string split in words
 * as specified.
 */
public static void wordsInAString() {
	System.out.println("Getting Words out of a String"); 
	in2 = new Scanner (System.in);
	print("\n Please write a sentence: \n");
	String s=in2.nextLine();
	StringSplitter sp1=new StringSplitter(s);
	sp1.splitString(s);
	print("Want to continue writing sentences, enter y for yes and n for no: \n");
	String choice=in2.next();
	String Y="y",N="n";
	while (choice.equals(Y))
	{
		if(choice.equals(Y))
		{
			wordsInAString();
		}

		Y="n";



	}

count5++;
}
/**
 * Method to initiate the actions to process a quadratic equation.
 */
public static void processQuadraticEquation(){
	System.out.println("Process a Quadratic Equation");
	


		{
			in3 = new Scanner (System.in);
			System.out.print("Please input the coefficient for the term x^2: ");
			float a1= in3.nextFloat();
			System.out.print("Please input the coefficient for the term x: ");
			float b1= in3.nextFloat();
			System.out.print("Please input constant value: ");
			float c1= in3.nextFloat();
			System.out.println("The quadratic equation specified is: " + a1 + "x^2+" + b1 + "+x" + c1 + "=0");
			QuadraticEquation e1= new QuadraticEquation(a1, b1, c1);	
			System.out.println("There is/are "+ e1.realSolutionsCount()+" solution(s) available for this equation");
			e1.getRealSolutions();
		}

		count1++;

	}

/**
 * Method to initiate the Menu for lists of numbers...
 */
public static void NumberList(){
	println("Compute Average of Numbers");
	NumberListManager SN = new NumberListManager();
	SN.getInstance();
	SN.run();
	count2++;
}

/**
 * Method to initiate the Menu for lists of pairs of numbers...
 */
public static void NumberPairList(){
	println("Compute Average of List of Pair of Numbers");
	NumberPairListManager SPN = new NumberPairListManager();
	SPN.getInstance();
	SPN.run();
	count3++;
}

}
