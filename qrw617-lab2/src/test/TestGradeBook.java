package test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestGradeBook {

	/***************************************
	 *               Median
	 ***************************************/
	
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
    public void testMedian11Element() {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        int[] i = {90, 77, 92, 86, 88, 98, 87, 80, 79, 75, 85};
        Arrays.sort(i);
        for (int grade : i) {
        	grades.add(grade);
        }
        core.Grades grade = new core.Grades("test", grades);
        double median = grades.get(grades.size()/2);
        assertEquals("11 element test failed", median, grade.median(),
                0.000001);
    }
	
	/***************************************
	 *               Average
	 ***************************************/
	
	@Test
	public void testAverageNull() {
		core.Grades grades = new core.Grades("test", null);
		boolean nullError = false;
        try {
            grades.average();
        } catch (NullPointerException e) {
            nullError = true;
        }
        assertTrue("should be a NullPointerException", nullError);
	}
	
	@Test
    public void testAverage10Element() {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        int[] i = {90, 77, 92, 86, 88, 98, 87, 80, 79, 75};
        double average = 0;
        for (int grade : i) {
        	average += grade;
        	grades.add(grade);
        }
        average /= i.length;
        core.Grades grade = new core.Grades("test", grades);
        assertEquals("10 element test failed", average, grade.average(),
                0.000001);
    }
	
	/***************************************
	 *               Minimum
	 ***************************************/
	
	@Test
	public void testMinimumNull() {
		core.Grades grades = new core.Grades("test", null);
		boolean nullError = false;
        try {
            grades.minimum();
        } catch (NullPointerException e) {
            nullError = true;
        }
        assertTrue("should be a NullPointerException", nullError);
	}
	
	@Test
    public void testMinimum10Element() {
        ArrayList<Integer> grades = new ArrayList<Integer>();
        int[] i = {90, 77, 92, 86, 88, 98, 87, 80, 79, 75};
        Arrays.sort(i);
        int minimum = i[0];
        for (int grade : i) {
        	grades.add(grade);
        }
        core.Grades grade = new core.Grades("test", grades);
        assertEquals("10 element test failed", minimum, grade.minimum(),
                0.000001);
    }
}
