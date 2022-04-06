
public class Employee_Constructor_Used extends Person_Constructor_Used {
	private int EmpID;
	private String Designation;
	public Employee_Constructor_Used(int empID, String designation,int age, String name, String address) {
		super(age,name,address);
		EmpID = empID;
		Designation = designation;
	}
	
	public void displayEmployee()
	{
		//System.out.println("Employee details:\n"+"age: "+Person_Constructor_Used.age+"name: "+Person_Constructor_Used.name+"Address: "+ Person_Constructor_Used.Address+"EmpID: "+EmpID+"Designation: "+Designation);
	}
	
}
