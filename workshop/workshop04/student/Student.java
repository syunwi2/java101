package student;

public class Student {
	// instance variables
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	// constructor
	public Student() {}
	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	// getter and setter methods for variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	// return average of variables, as double type
	public double getAvg() {
		double avg = (this.korean + this.english + this.math + this.science) / 4.0;
		return avg;
	}
	
	// return Grade, as String
	public String getGrade() {
		String grade;
		double avg = this.getAvg();
		
		if (90 <= avg && avg <= 100) {
			grade = "A";
		}
		else if (70 <= avg && avg < 90) {
			grade = "B";
		}
		else if (50 <= avg && avg < 70) {
			grade = "C";
		}
		else if (30 <= avg && avg < 50) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		return grade;
	}
}
