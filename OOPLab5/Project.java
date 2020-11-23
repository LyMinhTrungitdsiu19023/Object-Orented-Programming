package OOPLab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Project { 
    private String projectid;
    private Date startdate;
    private Date enddate;
    private ArrayList<Employee> listofemployee;



    public String getProjectid() {
        return projectid;
    }

    public void setProjectId(String projectid) {
        this.projectid = projectid;
    }

    public String getStartdate() {
        return new SimpleDateFormat("dd/mm/yyyy").format(startdate);
    }

    public void setStart(Date date) {
        startdate = date;
    }

    public String getEnddate() {
        return new SimpleDateFormat("dd/mm/yyyy").format(enddate);
    }

    public void setEnddate(Date date) {
        this.enddate = date;
    }

    public ArrayList<Employee> getListofemployee() {
        return listofemployee;
    }
    
    public Project(String projectid, String start, String end) {
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        this.projectid = projectid;
        try {
            this.startdate = format.parse(start);
            this.enddate = format.parse(end);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        listofemployee = new ArrayList<Employee>();
    } 
    public void addEmployee(Employee em) {
        listofemployee.add(em);
    }

    public int estimateBudget() {
        int budget = 0;
        long er = enddate.getTime() - startdate.getTime();
        int workingDays = (int)er / (1000 * 3600 * 24);
        System.out.println(workingDays);
        for (Employee e : listofemployee) {
            budget += workingDays * e.getSalaryPerHour() * 8;
        }
        return budget;
    }

    public String toString() {
        Collections.sort(listofemployee);
        return listofemployee.toString();
    }

}
