package test;

import static org.junit.Assert.*;
import org.junit.Test;
//import core.Grades;

public class TestGradeBook {

	//@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}
	
	@Test
	public void testMedianNull() {
		core.Grades grades = new core.Grades("test", null);
		//grades.median();
		boolean nullError = false;
        try {
            grades.median();
        } catch (NullPointerException e) {
            nullError = true;
        }
        assertTrue("should be a NullPointerException", nullError);
	}

}
