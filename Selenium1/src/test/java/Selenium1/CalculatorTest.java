package Selenium1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CalculatorTest {
	


	Calculator calc=new Calculator();
	
	@BeforeClass
	public static void SetupBeforeClass() throws Exception{
	System.out.println("Print before Class");
	}

	@AfterClass
	public static void SetupAfterClass() throws Exception{
	System.out.println("Print after Class");
	}
	
	@Before
	public void before(){
		System.out.println("Print before Method");
	}
	
	@After
	public void after(){
		System.out.println("Print after Method");
	}
	
	@Test
	public void testSub() {
		assertEquals(0, calc.sub(5, 5));
		assertNotEquals(1, calc.sub(5, 5));
		assertFalse(calc.sub(5, 5)==1);
		assertTrue(calc.sub(5, 5)==0);
		assertSame("Valid", 0, calc.sub(5, 5)); 
		assertNotSame(1, calc.sub(5, 5));
//		assertNull(null, calc.sub(5, 5)==0); 
		
		
		
	}

	@Ignore
	@Test
	public void testMul() {
		assertEquals(25, calc.mul(5, 5));
	}


//	@Test (expected = IllegalArgumentException.class)
//    public void throwsExceptionWhenNegativeNumbersAreGiven() {
//       
//		calc.sub(-1, 2);
//    }

}
