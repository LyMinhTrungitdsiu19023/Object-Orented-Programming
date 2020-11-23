package JavaTraining;

public class Student extends Person{
	private String id;
	private double gpa;
	private String major;
	
	public Student(String name, int age, String id, double gpa, String major) {
		super(name, age);
		this.id = id;
		this.gpa = gpa;
		this.major = major;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public void showInfo() {
		super.showInfo(); 
		System.out.println("ID: " 		+id);
		System.out.println("Major: " 	+major);
		System.out.println("GPA: " 		+gpa);
	}

}
