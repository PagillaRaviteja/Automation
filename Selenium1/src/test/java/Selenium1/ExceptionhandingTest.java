package Selenium1;

import org.junit.Test;

public class ExceptionhandingTest {


    
	Exceptionhanding exc=new Exceptionhanding();

 


    @Test(expected=ArithmeticException.class)
    public void testArithmeticException() {

        exc.math(1,0);

        }    
    
    @Test(expected=NullPointerException.class)
    public void testNullPointerException() {
        exc.nullexception(  null);
        }
    
    
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testArrayIndexOutOfBoundsException(){
        exc.arrayindexout(new int[]{10,20,30,40,50,60,70,80});
    }
    
    @Test(expected=StringIndexOutOfBoundsException.class)
    public void testStringIndexOut() {
        exc.IndexOutOfBound("selenium");
        }
    
 
    @Test(expected=NumberFormatException.class)
    public void testNumberFormat(){
        exc.numberformat("selenium");
    }
    
   


}
