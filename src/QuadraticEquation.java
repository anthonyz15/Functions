/**
 * 
 * @author Enrique A. Marrero Torres
 *
 */
public class QuadraticEquation { 
   private float a;  //coefficient of degree 2 term
   private float b;  //coefficient of degree 1 term
   private float c;  //coefficient of degree 0 term (constant term)
    public static int d=0;
    public QuadraticEquation(float a, float b, float c) { 
          this.a = a; 
          this.b = b; 
          this.c = c; 
    } 
    
        // ... implement getters for all coefficients .... NO setters at this moment.

    public float getA() {
		return a;
	}
	public float getB() {
		return b;
	}
	public float getC() {
		return c;
	}
	/** Counts number of different real solutions the equation
        has. 
        @return An integer value in range 0..2 (0, 1, or 2)
                corresponding to the number of different real 
                solutions that the equation has. 
    */
    public int realSolutionsCount() {
    
    	 if(((b*b)-(4*a*c))==0)
    { d=1;}
    else if(((b*b)-(4*a*c))>0)
    { d=2;}
    else  if(((b*b)-(4*a*c))<0)
    {d=0;}
    	 
	return d;	
	}
     //  ... As you must have seen in the past... the discriminant b*b-4*a*c is the key...
    

    /** Returns the real solutions of the equation, if any. 
        @return Reference to a new object (a pair of Float 
                objects) if the equation has at least one real
                solution. If no real solution, it then returns
                null value. In the case of only one real solution, 
                both components of that pair reference the same
                Float object whose value is that real solutions. 
                If it has two real solutions, the components
                of that pair object are references to both, 
                respectively.
    */
   public FLOATPair getRealSolutions() {
	   // ... your code ...
	   FLOATPair e1= new FLOATPair();
	  e1.calc(a, b, c);
	   System.out.println("One real solution is "+e1.getValue1());
	   System.out.println("One real solution is " +e1.getValue2());
	   return e1;
	   }
	   
   }
       
    


