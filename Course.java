public class Course implements Comparable <Course>{
	
	private boolean isGraduateCourse;
	
	private int courseNum;
	
	private String courseDept;
	
	private int numCredits;
	
	
	public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
		
		this.isGraduateCourse = isGraduateCourse;
		
		this.courseNum = courseNum;
		
		this.courseDept = courseDept;
		
		this.numCredits = numCredits;
		
	}
	
	public boolean isGraduateCourse() {
		
		return isGraduateCourse;
				
	}

	public int getCourseNum() {
		
		return courseNum;
		
	}
	
	public String getCourseDept() {
		
		return courseDept;
		
	}
	
	public int getNumCredits() {
		
		return numCredits;
		
	}
	
	public String getCourseName() {
		
		if(isGraduateCourse()) {
			
			return "G" + courseDept + courseNum; 
			
		}
		
		return "U" + courseDept + courseNum;
		
	}
	
	@Override
	
	public boolean equals (Object obj) {
		
		if(obj == null) {
			
			return false;
			
		}
		
		if(obj instanceof Course) {
			
			if(((Course) obj).isGraduateCourse() == isGraduateCourse) {
				
				if(((Course) obj).getCourseNum() == courseNum) {
					
					if(((Course) obj).getCourseDept().equals(courseDept)){
						
						if(((Course) obj).getNumCredits() == numCredits) {
							
							return true;
							
						}
						
					}
					
				}
			}
			
		}
		
		return false;
		
	}
	
	
	@Override
	
	public String toString() {
		
		String graduateString = "Graduate";
		
		if(isGraduateCourse() == false) {
			
			graduateString = "Undergraduate";
			
		}
		
	return String.format("Course: %3s-%3d | Number of Credits: %02d | %s",
			
			getCourseDept(), getCourseNum(), getNumCredits(), graduateString);
			
		}
	
	@Override
	
	public int compareTo(Course c) {
		
		if(getCourseNum() > c.getCourseNum()){
			
			return 1;
			
		}
		
		if(getCourseNum() < c.getCourseNum()){
			
			return -1;
			
		}
		
		else {
			
			return 0;
		}
		
	}
	
}