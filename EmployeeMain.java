
public class EmployeeMain {

	//Inheritance
	public static void main(String[] args) {
		Person person=new Person();
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		person.setAge(20);
		person.setName("Hari");
		person.setAddress("Kerala");
		employee1.setAge(32);
		employee1.setName("Vasu");
		employee1.setAddress("India");
		employee1.setEmpID(452);
		employee1.setDesignation("QA");		
		employee2.setAge(45);
		employee2.setName("Helen");
		employee2.setAddress("UK");
		employee2.setEmpID(786);
		employee2.setDesignation("FSD");	
		
		System.out.println("Printing Person's details::\n******************\nage,name and Address are::"+person.getAge()+" "+person.getName()+" "+person.getAddress());
		System.out.println("\nPrinting Employee Details\n*********************");
		System.out.println("Name,address,age,EmpId,Designation::"+employee1.getName()+""+employee1.getAddress()+" "+employee1.getAge()+" "+employee1.getEmpID()+ " "+ employee1.getDesignation());
		System.out.println("Name,address,age,EmpId,Designation::"+employee2.getName()+""+employee2.getAddress()+" "+employee2.getAge()+" "+employee2.getEmpID()+ " "+ employee2.getDesignation());
		
	}

}
