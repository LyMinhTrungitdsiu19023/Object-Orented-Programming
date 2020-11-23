package School;

import java.util.Calendar;

public class Student { 
	
	private String name; 
	private String id; 
	private String sex;
	private int birthday; 
	private double score; 
	
	
	//Constructor
	public Student(String name, String id, String sex, int birthday, double score) {
		super();
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.birthday = birthday;
		this.score= score; 
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	} 
	
	public int getAge() {
		
		//age = 2020 - this.getBirthday();
		Calendar now = Calendar.getInstance(); 
		return +now.get(Calendar.YEAR) - this.getBirthday();
		
	}
	
	public void showinfo() {
		

		System.out.println("Name \t\t:" +this.getName());
		if(id.equals(id)) {
			System.out.println("ID is loop, please change");
		}else {
		System.out.println("ID \t\t:"+ this.getId());
		}
		System.out.println("Sex \t\t:" + this.getSex());
		System.out.println("Bithday \t:" +this.getBirthday());
		System.out.println("Age \t\t:" +getAge()); 
		System.out.println("Score \t\t:" +this.getScore());

}

	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
}
