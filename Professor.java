// Professor.java (Subclass)
public class Professor extends StaffMember {
    private String department;
    private String researchArea;

    public Professor(String name, int employeeId, double salary, String department, String researchArea) {
        super(name, employeeId, salary);
        this.department = department;
        this.researchArea = researchArea;
    }

    public void teach() {
        System.out.println("Teaching a class...");
    }

    public void conductResearch() {
        System.out.println("Conducting research in " + researchArea);
    }
}