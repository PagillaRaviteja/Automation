package Selenium1;

public class Exceptionhanding {

	public int math(int x, int y){
        return x/y;
        }
	
	 public char nullexception(String x){
	        return x.charAt(0);
	        }
	 
	 public char IndexOutOfBound(String x){
	        return x.charAt(10);
	        }
	 
	 public int numberformat(String x){
	        int m=Integer.parseInt(x);
	        return m;
	    }
	    
	    public int arrayindexout(int[] x){
	        return x[10];
	    }
}
