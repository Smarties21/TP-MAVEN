
public class Calculatrice {
	
	public static int Division(int a, int b) {
		
		int result;
	    
	    	  result = (a / b);
	     
	     return result;
	}
	
	static int Modulo (int a , int b )
	{
		int result = a % b;
		return result ;
	}
	
	public static void main (String[] args) {
		
		System.out.println(Division(10,2));
		System.out.println(Modulo(23,2));
		
	}
	
}
