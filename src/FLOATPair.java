
public class FLOATPair {
	private float value1;
	private float value2;
	
	public FLOATPair(){
	
	}
	
	public void calc(float a,float b, float c){
		
		if(QuadraticEquation.d==0){
			
			this.value1=((-b+0)/2*a);
			this.value2= value1;
		}
		else if(QuadraticEquation.d>0){
			this.value1=  (float) (((-b+(Math.sqrt((b*b)-(4*a*c)))))/2*a);
			this.value2= (float) (((-b-(Math.sqrt((b*b)-(4*a*c)))))/2*a);}
		else if(QuadraticEquation.d<0){
		}
		}
		public float getValue1() {
			return value1;
		}
		public float getValue2() {
			return value2;
		}
	

	
		
	}