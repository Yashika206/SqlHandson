package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompoundInterestTest {

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	public void setUp() throws Exception {
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test1(){						//for PA, ROI, Period =  positive integers
		Interest i1 = new Interest();	
		double CI = i1.compoundInterest(500000, 8.5, 7);			
		assertEquals(385071.12354747136, CI);
	}

	@Test
	public void test2(){						//for PA= negative integers
		Interest i1 = new Interest();	
		double CI = i1.compoundInterest(-1000, 5, 2);			
		assertEquals(0, CI);
	}

	@Test
	public void test3(){						//for PA= 0
		Interest i1 = new Interest();	
		double CI = i1.compoundInterest(0, 5, 2);			
		assertEquals(0, CI);

	}

	@Test
	public void test4(){						//for PA= character
		Interest i1 = new Interest();	
		double CI = i1.compoundInterest('a', 5, 2);			
		assertEquals(0, CI);
	}

	@Test
	public void test5(){						//for PA= float
		Interest i1 = new Interest();	
		double CI = i1.compoundInterest(150000.55, 5, 4);		
		assertEquals(32326.05602843754, CI);
	}

	@Test
	public void test6(){						//for PA, ROI= negative integers and Period= positive integer
		Interest i1 = new Interest();	
		double CI = i1.compoundInterest(-1000, -4, 2);			
		assertEquals(0, CI);
	}

	@Test
	public void test7(){						//for PA, ROI, Period= 0
		Interest i1 = new Interest();	
		double CI = i1.compoundInterest(0, 0, 0);			
		assertEquals(0, CI);
	}

	@Test
	public void test8(){						//for PA, ROI, Period = negative integers
		Interest i1 = new Interest();	
		double CI = i1.compoundInterest(-1000, -5, -2);			
		assertEquals(0, CI);
	}
}