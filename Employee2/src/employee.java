public class employee {
	String name;
	double salary;
	double workHours;
	int hireYear;
	double tax;
	double bonus;
	double inc;
	
	public employee(String name, double salary, double workHour, int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	public void tax(double salary) {
		if(salary>=1000) {
		  tax=salary*3/100;
		}else {
			this.tax=0;
		}		
		}
	public void bonus(double workHours) {
		if(workHours>40) {
			double h= workHours-40;
			 bonus=h*30;
		}else {
			bonus=0;		}
}
	public void raiseSalary(int hireyear) {
		 int year=2023-hireYear;
		if(year<10) {
			inc=salary*5/100;
		}
		if(year>9 && year<20) {
			inc=salary*10/100;
		}
		if(year>19) {
			inc=salary*15/100;
		}
		
	}
	public String toString() {
		return ("Name: "+this.name+"\nSalary: "+this.salary+"\nStart Year: "+this.hireYear+"\nTax: "+this.tax
				+"\nBonus: "+this.bonus+"\nSalary increase: "+this.inc+"\nSalary(tax+bonus): "+(salary+bonus-tax)+"\nNew Salary: "+(salary+inc));
		
	}
	
}