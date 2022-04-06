
public class Employee extends Person {

	private int EmpID;
	private String Designation;
	
	public Employee() {
		
		System.out.println("Employee Class");
	}
	
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	
}
