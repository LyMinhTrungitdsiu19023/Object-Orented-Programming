package OOPLab5;



public class ProjectPrinter implements Runnable{

	private Project project;
	public ProjectPrinter(Project project) {
		this.project = project;
	} 
	
	
	public void run() {
		for (Employee em : project.getListofemployee()) {
		System.out.println("[" + "Project ID: " + project.getProjectid() + " - Project Duration: " + project.getStartdate() + " to " + project.getEnddate() + "] [Name: " + em.getEmployeeName() + " - Salary Per Hour: " + em.getSalaryPerHour() + "]"); 
       try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		}
	}

}
