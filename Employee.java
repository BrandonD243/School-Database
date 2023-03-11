public class Employee extends Person{
	
	private String deptName;
	
	private static int numEmployees;
	
	private int employeeID;
	
	
	public Employee() {
		
		deptName = "";
		
		numEmployees += 1;
		
		employeeID = numEmployees;
				
	}
	
	public Employee(String deptName) {
		
		this.deptName = deptName;
		
		numEmployees += 1;
		
		employeeID = numEmployees;
		
	}
	
	public Employee(String name, int birthYear, String deptName) {
		
		super(name, birthYear);
		
		this.deptName = deptName;
		
		numEmployees += 1;
		
		employeeID = numEmployees;
		
	}
	
	public String getDeptName() {
		
		return deptName;
		
	}
	
	static int getNumEmployees(){
		
		return numEmployees;
		
	}
	
	public int getEmployeeID() {
	
		return employeeID;
		
	}
	
	public void setDeptName(String deptName) {
		
		this.deptName = deptName;
		
	}
	
	@Override
	
	public boolean equals(Object obj) {
		
		if(obj == null) {
			
			return false;
			
		}
		
		if(obj instanceof Employee) {
		
		if(super.equals(obj)) {
					
					if(((Employee) obj).getEmployeeID() == getEmployeeID()) {
						
						return true;
						
					}
					
		}
		
		}
		
		return false;
		
	}
	
	@Override
	
	public String toString() {
		
		return String.format(super.toString() + 
				
				" Employee: Department: %20s | Employee Number: %3d", deptName, employeeID);
		
	}
	
	public int compareTo(Employee e) {
		
		super.compareTo(e);
		
		if(getEmployeeID() > e.getEmployeeID()){
			
			return 1;
			
		}
		
		if(getEmployeeID() < e.getEmployeeID()){
			
			return -1;
			
		}
		
		else {
			
			return 0;
			
		}
		
		}
		
	}
