public class Course {
	String courseName;
	String code;
	Teacher courseTeacher;
	String prefix;
	int note;
	
	public Course(String courseName, String code,String prefix) {
		this.courseName=courseName;
		this.code=code;
		this.prefix=prefix;
		this.note=0;
	}
	public void addTeacher(Teacher t) {
		if(prefix.equals(t.branch)) {
			this.courseTeacher=t;
		}
		else {
			System.out.println(t.name+" Academician cannot teach this course!");
		}
		
	}
	public void printTeacher() {
		if(courseTeacher!=null) {
			System.out.println("Academician of the "+courseName+": "+courseTeacher.name);
		}
		else {
			System.out.println(courseName+" do not have academician!");
		}
	}
	

}
