package OOPLab3;
import java.util.Scanner;
class Person {
    private String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "Name: '" + name + '\'' +
                ", Address: '" + address + '\'' +
                ']';
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.fee = fee;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "=> Student{" +
                super.toString()+
                " Program: '" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                '}';
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.pay = pay;
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "=> Staff{"+
                super.toString()+
                "school: '" + school + '\'' +
                ", pay: " + pay +
                '}';
    }
}

public class Excercise3 {
    public static void main(String[] args) {
        String stsname;
        String stsadd;
        String program;
        int year;
        double fee;
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Student info");
        System.out.print("Name: ");
        stsname = scanner.nextLine();
        System.out.print("Address: ");
        stsadd = scanner.nextLine();
        System.out.print("Program: ");
        program = scanner.nextLine();
        System.out.print("School Year: ");
        year = scanner.nextInt();
        System.out.print("Fee: ");
        fee = scanner.nextInt();
        Student st = new Student(stsname,stsadd, program, year, fee);
        System.out.println(st.toString());
        
    	System.out.println("Staff info");
        System.out.print("Name: ");
        String stfname = scanner.nextLine();
        System.out.print("Address: ");
        String stfadd = scanner.nextLine();
        System.out.print("School: ");
        String school = scanner.nextLine();
        System.out.print("Pay: ");
        double pay = scanner.nextInt();
    	Staff staff = new Staff(stfname,stfadd, school, pay);
        System.out.println(staff.toString());
    }
}
