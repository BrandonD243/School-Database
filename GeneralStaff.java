public class GeneralStaff extends Employee{
	
	private String duty;
	
	
	public GeneralStaff() {
		
		duty = "";
		
	}
	
	public GeneralStaff(String duty) {
		
		this.duty = duty;
		
	}
	
	public GeneralStaff(String deptName, String duty) {
		
		super(deptName);
		
		this.duty = duty;
		
	}
	
	public GeneralStaff(String name, int birthYear, String deptName, String duty) {
		
		super(name, birthYear, deptName);
		
		this.duty = duty;
		
	}
	
	public String getDuty() {
		
		return duty;
		
	}
	
	@Override
	
	public boolean equals(Object obj) {
		
		if(obj == null) {
			
			return false;
			
		}
		
		if(obj instanceof GeneralStaff) {
			
			if(super.equals(obj)) {
						
						if(((GeneralStaff) obj).getDuty().equals(getDuty())) {
							
							return true;
							
						}

			}
			
		}
		
		return false;
		
	}
	
	public String toString() {
		
		return super.toString() + String.format(" GeneralStaff: Duty: %10s", duty);
		
	}

}