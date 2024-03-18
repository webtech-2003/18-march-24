// AdministrativeStaff.java (Subclass)
public class AdministrativeStaff extends StaffMember {
    private String role;
    private String officeLocation;

    public AdministrativeStaff(String name, int employeeId, double salary, String role, String officeLocation) {
        super(name, employeeId, salary);
        this.role = role;
        this.officeLocation = officeLocation;
    }

    public void manageRecords() {
        System.out.println("Managing records as " + role);
    }
}