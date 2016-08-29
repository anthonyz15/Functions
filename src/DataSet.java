/**
 * 
 * @author Enrique A. Marrero Torres
 *
 */
public class DataSet {
	private int count=0;
	private float value=0;
	private float valueY=0;
	private float Total=0;
	private float Total2=0;
	private float TotalY=0;
	private float TotalY2=0;
	private float Average=0;
	private float AverageY=0;
	private float StandardDeviation=0;
	private float StandardDeviationY=0;
	
	public void Total(){
		boolean Exit=false;
		String Valid;
		while (!Exit){
			System.out.print("\n\t\tEnter x value "+(count+1)+": ");
			Valid= ProjectUtils.readStringNow();
			if (Valid.equals("END")){
				Exit=true;
			}
			else if (Valid.isEmpty()){
				Exit=true;
			}
			else {
				value=Float.parseFloat(Valid);
				Total+=value;
				Total2=value*value;
				count++;
				}
		}
	}
	
	public void TotalPair(){
	
		boolean Exit=false;
		String Valid;
		String Valid2;
		while (!Exit){
			System.out.print("\n\t\tEnter x value "+(count+1)+": ");
			Valid=ProjectUtils.readStringNow();
			if (Valid.equals("END"))
				Exit=true;
			else {
				System.out.print("\n\t\tEnter y value "+(count+1)+": ");
				Valid2=ProjectUtils.readStringNow();
				if (Valid2.equals("END")){
					Exit=true;
					}
				else {
					value=Float.parseFloat(Valid);
					valueY=Float.parseFloat(Valid2);
					Total+=value;
					TotalY+=valueY;
					Total2=value*value;
					TotalY2=value*value;
					count++;
					}
				}
		}
	}
	
	public void Average(){
		if (count>=1)
		Average=Total/count;
		else
		Average=0;
	}
	public void AveragePair(){
		if (count>=1){
			Average=Total/count;
			AverageY=TotalY/count;
		}
	}
	/**
	 * Method for calculating the standard deviation in a list of numbers
	 */
	public void StandardDeviation(){
		Average();
		if (count<=1){
			System.out.println("The Standard Deviation is "+0.0);
		}
		else {
			StandardDeviation=(float)Math.sqrt((Total2-Total*Total/count)/(count-1));
		}
	}
	/**
	 * Method for calculating the standard deviation in a list of pairs of numbers.
	 */
	public void StandardDeviationPair(){
		AveragePair();
		if (count<=1|| Total<=0){
			System.out.println("The Standard Deviation of x and y is "+0.0);
		}
		else {
			StandardDeviation=(float)Math.sqrt((Total2-Total*Total/count)/(count-1));
			StandardDeviationY=(float)Math.sqrt((TotalY2-TotalY*TotalY/count)/(count-1));
			
		}
	}
	/**
	 * Counter for the class
	 * @return the counter's amount
	 */
	public int getCount(){
		return count;
	}
	/**
	 * Gets the data from Total2
	 * @return value for Total2
	 */
	public float Total2(){
		return Total2();
	}
	/**
	 * Gets the data from Total
	 * @return List of Numbers entered by the user
	 */
	public float getTotal(){
		return Total;
	}
	
	/**
	 * Gets the average from Average
	 * @return the average itself
	 */
	public float getAverage(){
		return Average;
	}
	/**
	 * Gets the average from AverageY
	 * @return the average in the Y coordinate
	 */
	public float getAverageY(){
		return AverageY;
	}
	/**
	 * Gets the standard deviation from StandardDeviation
	 * @return the standard deviation in the X coordinate
	 */
	public float getStandardDeviation(){
return StandardDeviation;
	}
	/**
	 * Gets the standard deviation from StandardDeviationY
	 * @return the standard deviation in the Y coordinate
	 */
	public float getStandardDeviationY(){
		return StandardDeviationY;
	}
}