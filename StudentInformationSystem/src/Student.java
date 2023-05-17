public class Student {
	String name;
	String studentNo;
	double average;
	String isPass;
	Course math;
	Course chemical;
	Course physical;
	public Student(String name, double average, String studentNo, Course math, Course chemical,
			Course physical) {
		this.name = name;
		this.studentNo = studentNo;
		this.average = average;
		this.math = math;
		this.chemical = chemical;
		this.physical = physical;
	}
	
	public void addExamNote(int mat,int chemical,int physical) {
		if(mat>=0 && mat<=100) {
			this.math.note=mat;
		}
		if(chemical>=0 && chemical<=100) {
			this.chemical.note=chemical;
		}
		if(physical>=0 && physical<=100) {
			this.physical.note=physical;
		}
	}
	
	
	public String isPass() {
		this.average= (this.math.note+this.physical.note+this.chemical.note)/3;
		if(average >= 50) {
			return name+" passed the class.";
		}
		else {
			return name+" failed in class";
		
		
	}
}
	public void printNote() {
		System.out.println("=========================");
		System.out.println("Name of student: "+name);
		System.out.println("Math Grade: "+math.note);
		System.out.println("Physical Grade: "+physical.note);
		System.out.println("Chemical Grade: "+chemical.note);
	}
}
