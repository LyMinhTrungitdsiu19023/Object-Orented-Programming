package School;

import java.util.Calendar;

public class Teacher { 
	
	private String name; 
	private String id; 
	private String sex;
	private int birthday;
	
	
	
	//Constructor
	public Teacher(String name, String id, String sex, int birthday) {
		super();
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.birthday = birthday;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	} 
	public int getAge() {
		
		//age = 2020 - this.getBirthday();
		Calendar now = Calendar.getInstance(); 
		return +now.get(Calendar.YEAR) - this.getBirthday();
		
	}
	public void showinfo() {
		System.out.println("Name \t\t:" +this.getName());
		System.out.println("ID \t\t:"+ this.getId());
		System.out.println("Sex \t\t:" + this.getSex());
		System.out.println("Bithday \t:" +this.getBirthday());
		System.out.println("Age \t\t:" +getAge());
}

}
