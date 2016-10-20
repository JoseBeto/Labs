package paintpanel;
import java.awt.*;
import java.util.ArrayList;

/**
 * The DemoModel class holds the information that is used by the GUI.
 * Ask yourself the question, what data would be needed to recreate
 * the state of the GUI?  This data is what should be stored in the
 * model.
 * @author Tom Bylander
 */
public class DemoModel {
    /** 
     * The number of points 
     */
	private int pointCount;

	/** 
	 * Changed from array to ArrayList
	 * ArrayList of points and colors
	 */
	private ArrayList<Point> points;
	private ArrayList<Color> colors;
	
	/** 
	 * The color selected by the user
	 */
	private Color selectedColor;
	
	/**
	 * DemoModel will create point and color ArrayList and make the default
	 * 		color Cyan
	 */
	
	public DemoModel() {
		pointCount = 0;
		points = new ArrayList<Point>();
		colors = new ArrayList<Color>();
		selectedColor = Color.CYAN;
	}
	
	/**
	 * Add a Point to the points array.
	 * Add a Color to the colors array.
	 * @param point the Point to be added to points.
	 */
	public void addPoint(Point point) {
		points.add(pointCount, point);
		colors.add(pointCount, getSelectedColor());
		pointCount++;
	}
	
	/**
	 * Returns point at index i.
	 * Returns null if no such point exists.
	 * @param i
	 */
	public Point getPoint(int i) {
		if (i >= 0 && i < pointCount) {
			// probably should return a new point so that the return
			// value cannot be used to change the array element
			return points.get(i);
		}
		return null;
	}
	
	/**
	 * Returns color at index i.
	 * Returns null if no such point exists
	 * @param i
	 * @return Color
	 */
	
	public Color getColor(int i){
		if (i >= 0 && i < pointCount){
			return colors.get(i);
		}
		return null;
	}
	
	/**
	 * Store the color that the user selected.
	 * @param color the color selected by the user
	 */
	public void setSelectedColor(Color color) {
		selectedColor = color;
	}
	
	/**
	 * @return the color selected by the user
	 */
	public Color getSelectedColor() {
		return selectedColor;
	}
	
	
}
