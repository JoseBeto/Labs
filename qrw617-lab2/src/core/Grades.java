package core;
import java.util.ArrayList;

/*******************************
 * 
 * Grades class receives the organized data from Lab2 class and
 * 		computes length, average, median, etc. It also returns
 * 		information queried, such as certain variables such as name
 * 		and number of grades stored
 * 
 * @author Jose Bocanegra
 * 
 *******************************/

public class Grades {
	
	private String name;
	private ArrayList<Integer> gradeNum = new ArrayList<Integer>();
	
	public Grades(String name, ArrayList<Integer> g){
		this.name = name;
		gradeNum = g;
	}
	
	public String toString(){
		return name + " " + gradeNum;
	}
	
	public String getName(){
		return name;
	}
	
	public int length(){
		return gradeNum.size();
	}
	
	public double average(){
		double sum = 0;
		for(double grade: gradeNum){
			sum += grade;
		}
		return sum/gradeNum.size();
	}
	
	public double median(){
		int temp;
		for(int i = 0; i < gradeNum.size(); i++){
			for(int j = 0; j < gradeNum.size(); j++){
				if (gradeNum.get(j) < gradeNum.get(i)){
					temp = gradeNum.get(i);
					gradeNum.set(i, gradeNum.get(j));
					gradeNum.set(j, temp);
				}
			}
		}
		if((gradeNum.size() % 2) == 0){ //Size is even, find median
			int k = gradeNum.size() / 2;
			return (gradeNum.get(k) + gradeNum.get(k-1))/2.0;
		}
		else
			return gradeNum.get(gradeNum.size()/2);
	}
	
	public int maximum(){
		int largest = 0;
		for(int grade: gradeNum){
			if (grade > largest){
				largest = grade;
			}
		}
		return largest;
	}
	
	public int minimum(){
		int smallest = gradeNum.get(0);
		for(int grade: gradeNum){
			if (grade < smallest){
				smallest = grade;
			}
		}
		return smallest;
	}
}
