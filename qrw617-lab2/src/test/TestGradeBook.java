package test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class TestGradeBook {

	//@Test
	//public void test() {
	//	fail("Not yet implemented");
	//}
	
	@Test
	public void testMedianNull() {
		core.Grades grades = new core.Grades("test", null);
		boolean nullError = false;
        try {
            grades.median();
        } catch (NullPointerException e) {
            nullError = true;
        }
        assertTrue("should be a NullPointerException", nullError);
	}
	
	@Test
    public void testMedian10Element() {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        //grades.add(new Integer 90, 80);
        core.Grades grade = new core.Grades("test", grades);
        double average = 0;
        for (int grade : grades) {
            average += grade;
        }
        average /= grades.length;
        assertEquals("10 element test failed", average, gb.getAverage(),
                0.000001);
    }

}
