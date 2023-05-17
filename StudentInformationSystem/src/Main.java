
public class Main {

	public static void main(String[] args) {
		Course math = new Course("Math","MATH102","MTH");
		Course physical = new Course("Physical","PHYS105","PHYS");
		Course chemical = new Course("Chemical","CHEM102","CHEM");
		
	
	Teacher t1 = new Teacher("John","MTH");
	Teacher t2 = new Teacher("Tim","PHYS");
	Teacher t3 = new Teacher("Sue","CHEM");
	
	math.addTeacher(t2);
	physical.addTeacher(t1);
	chemical.addTeacher(t3);
	
	
	
	Student s1 = new Student("Alex",4,"123789",math,chemical,physical);
	s1.addExamNote(10, 20, 32);
	s1.printNote();
	System.out.println(s1.isPass());
	Student s2 = new Student("Lucas",4,"647231",math,chemical,physical);
	s2.addExamNote(80, 75,63);
	s2.printNote();
	System.out.println(s2.isPass());
	Student s3 = new Student("Albert",4,"913456",math,chemical,physical);
	s3.addExamNote(71,87, 92);
	s3.printNote();
	System.out.println(s3.isPass());
	
	math.printTeacher();
	chemical.printTeacher();
	physical.printTeacher();
	
}
}