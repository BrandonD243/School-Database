public class Person implements Comparable<Person>{
	
	private String name;
	
	private int birthYear;
	
	
	public Person() {
		
		name = "";
		
		birthYear = 0;
		
	}
	
	public Person(String name, int birthYear) {
		
		this.name = name;
		
		this.birthYear = birthYear;
		
	}
	
	public String getName(){
		
		return name;
				
	}
	
	public int getBirthYear() {
		
		return birthYear;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setBirthYear(int birthYear) {
		
		this.birthYear = birthYear;
		
	}
	
	@Override
	
	public boolean equals(Object obj) {
		
		if(obj == null) {
			
			return false;
			
		}
		
		if(obj instanceof Person) {
			
			if(((Person) obj).getName().equals(name)) {
				
				if(((Person) obj).getBirthYear() == birthYear){
					
					return true;
					
				}
			}
			
		}
		
		return false;
	}
	
	@Override
	
	public String toString() {
		
		return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
		
	}
	
	@Override
	
	public int compareTo(Person p) {
		
		if(getBirthYear() > p.getBirthYear()){
			
			return 1;
			
		}
		
		if(getBirthYear() < p.getBirthYear()){
			
			return -1;
			
		}
		
		else {
			
			return 0;
		}
		
	}

}
