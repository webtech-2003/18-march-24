// StaffMember.java (Superclass)
public class StaffMember {
    private String name;
    private int employeeId;
    private double salary;

    public StaffMember(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
        public static void main(String[] args) {
            // Create instances of Professor, AdministrativeStaff, and SupportStaff
            Professor professor = new Professor("John Doe", 123, 60000, "Computer Science", "Artificial Intelligence");
            AdministrativeStaff adminStaff = new AdministrativeStaff("Jane Smith", 456, 40000, "Administrator", "Main Office");
            SupportStaff supportStaff = new SupportStaff("Alice Johnson", 789, 30000, "Receptionist", "Morning Shift");
    
            // Call methods on the objects
            professor.displayInfo();
            professor.teach();
            professor.conductResearch();
    
            System.out.println();
    
            adminStaff.displayInfo();
            adminStaff.manageRecords();
    
            System.out.println();
    
            supportStaff.displayInfo();
            supportStaff.assistStudents();
        }
}
