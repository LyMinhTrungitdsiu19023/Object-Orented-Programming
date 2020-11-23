package OOPLab5;


public class Employee implements Comparable<Employee>{
	private String employeeid;
	private String employeeName;
	private int salaryPerHour;
	private int noOfLeavingDay; 
	private int noOfTravelDay;
	
	public Employee(Project project, String employeeid, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
		project.addEmployee(this);
		this.setEmployeeid(employeeid);
		this.setEmployeeName(employeeName);
		this.setSalaryPerHour(salaryPerHour);
		this.setNoOfLeavingDay(noOfLeavingDay);
		this.setNoOfTravelDay(noOfTravelDay);
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getNoOfLeavingDay() {
		return noOfLeavingDay;
	}

	public void setNoOfLeavingDay(int noOfLeavingDay) {
		this.noOfLeavingDay = noOfLeavingDay;
	}

	public int getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(int salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public int getNoOfTravelDay() {
		return noOfTravelDay;
	}

	public void setNoOfTravelDay(int noOfTravelDay) {
		this.noOfTravelDay = noOfTravelDay;
	}  
	
	
	public int calculateWeeklysalary() {
		return salaryPerHour*8*(5-noOfLeavingDay + noOfTravelDay/2);
	}
	@Override
	public int compareTo(Employee e) {
        if (this.noOfTravelDay > e.noOfTravelDay)
            return 1;
        else if (this.noOfTravelDay < e.noOfTravelDay)
            return -1;
        else {
            if (this.noOfLeavingDay < e.noOfLeavingDay)
                return 1;
            else if (this.noOfLeavingDay > e.noOfLeavingDay)
                return -1;
            else
                return 0;
        }
		
	}
	@Override
	public String toString() {
		return "Name: " + employeeName + "- Salary Per Hour: " + salaryPerHour + "- Weekly Salary: " + calculateWeeklysalary(); 
	}
	
	

}
