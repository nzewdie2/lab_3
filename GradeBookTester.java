import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	GradeBook test1;
	GradeBook test2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		test1 = new GradeBook(5);
		test2 = new GradeBook(5);
		
		test1.addScore(9);
		test1.addScore(3.2);
		test1.addScore(18);

		test2.addScore(4.8);
		test2.addScore(13);

		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		test1 = null;
		test2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue((test1.toString().equals("9.0 3.2 18.0 ")));
		assertTrue((test2.toString().equals("4.8 13.0 ")));
		
		assertEquals(test1.getScoreSize(), 3);
		assertEquals(test2.getScoreSize(), 2);
		
		
	}

	@Test
	void testSum() {
		assertEquals(30.2,test1.sum(),.0001);
		assertEquals(17.8,test2.sum(),.0001);
		
	}

	@Test
	void testMinimum() {
		assertEquals(3.2,test1.minimum(),.0001);
		assertEquals(4.8,test2.minimum(),.0001);
		
		
	}

	@Test
	void testFinalScore() {
		assertEquals(27,test1.finalScore(),.0001);
		assertEquals(13,test2.finalScore(),.0001);

		
	}

	@Test
	void testGetScoreSize() {
		
	}

	@Test
	void testToString() {
		
	}

}
