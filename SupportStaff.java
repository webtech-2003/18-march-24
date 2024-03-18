// SupportStaff.java (Subclass)
public class SupportStaff extends StaffMember {
    private String jobTitle;
    private String shift;

    public SupportStaff(String name, int employeeId, double salary, String jobTitle, String shift) {
        super(name, employeeId, salary);
        this.jobTitle = jobTitle;
        this.shift = shift;
    }

    public void assistStudents() {
        System.out.println("Assisting students as " + jobTitle);
    }
}