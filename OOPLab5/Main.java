package OOPLab5;

public class Main {

	public static void main(String[] args) {
        Project project = new Project("ITDSIU19023", "26/05/2020", "26/12/2020");
        ProjectPrinter print = new ProjectPrinter(project); 
        

        Employee em1 = new Employee(project, "ITDS", "TrungLy", 100, 0, 0);
        Employee em2 = new Employee(project, "ITDS2", "MinhTrung", 200, 1, 3);
        Employee em3 = new Employee(project, "ITDS3", "LyTrung", 50, 2, 2);
        

        Thread thread = new Thread(print);
        thread.start();

	}

}
