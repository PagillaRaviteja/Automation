package Selenium1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//@Ignore
public class Assign2Test {


	Assign2 ass = new Assign2();
	
	
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
	public void arraytest(){
		
		assertEquals(5, ass.array(new int[]{1,2,3,4,5}));
	}
	
	@Test(timeout=20000)
	public void test() {
		int i=3 ;
		int j=5;
		int k ;
		k=i+j;
		if(k==8) {
        System.out.println(k);
	}

	}

}
