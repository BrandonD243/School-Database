public class Faculty extends Employee {
	
	private Course [] coursesTaught;
	
	private int numCoursesTaught;
	
	private boolean isTenured;
	
	
	public Faculty() {
		
		coursesTaught = new Course [100];
		
		numCoursesTaught = 0;
		
		isTenured = false;
		
	}
	
	public Faculty(boolean isTenured) {
		
		coursesTaught = new Course [100];
		
		numCoursesTaught = 0;
		
		this.isTenured = isTenured;
		
	}
	
	public Faculty(String deptName, boolean isTenured) {
		
		coursesTaught = new Course [100];
		
		setDeptName(deptName);
			
		numCoursesTaught = 0;
		
		this.isTenured = isTenured;
		
	}
	
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		
		this(deptName, isTenured);
		
		coursesTaught = new Course [100];
		
		setName(name);
		
		setBirthYear(birthYear);
				
		numCoursesTaught = 0;
		
		this.isTenured = isTenured;
		
	}
	
	public boolean isTenured() {
		
		return isTenured;
		
	}
	
	public int getNumCoursesTaught() {
		
		return numCoursesTaught;
		
	}
	
	public void setIsTenured(boolean isTenured) {
		
		this.isTenured = isTenured;
		
	}
	
	public void addCourseTaught(Course course) {
		
		if(numCoursesTaught < 100) {
		
		coursesTaught[numCoursesTaught++] = course;
		
		}
		
	}
	
	public void addCoursesTaught(Course [] course) {
		
		if(numCoursesTaught < 100) {
			
			for(int i = numCoursesTaught; i < course.length && numCoursesTaught < 100; i++) {
				
				addCourseTaught(course[i]);
				
			}
			
		}
		
	}
	
	public Course getCourseTaught(int index) {
		
		if((coursesTaught[index] == null) || (index < 0 && index > coursesTaught.length)) {
			
			return null;
			
			}
		
		return coursesTaught[index];
		
	}
	
	public String getCourseTaughtAsString(int index) {
		
		if((index < 0 || index >= coursesTaught.length)) {
			
			return "";
			
			}
		
		else if((coursesTaught[index] != null) && (index > 0 || index < coursesTaught.length) ) {
		
		return coursesTaught[index].getCourseDept() + "-" + coursesTaught[index].getCourseNum();
		
		}
		
		return "";
		
	}
	
	public String getAllCoursesTaughtAsString() {
		
		String allCourses = "";
		
		if(coursesTaught != null) {
			
			for(int i = 0; i < numCoursesTaught; i++) {
				
				if(i == numCoursesTaught - 1) {
					
					allCourses += getCourseTaughtAsString(i);
					
				}
				
				else {
				
				allCourses += getCourseTaughtAsString(i) + ",";
				
				}
			
		}
			
		}
		
		return allCourses;
				
	}
	
	@Override
	
	public boolean equals (Object obj) {
		
		if(obj == null) {
			
			return false;
			
		}
		
		if(obj instanceof Faculty) {
			
			if(super.equals(obj)){
								
								if(((Faculty) obj).coursesTaught == coursesTaught) {
								
								if(((Faculty) obj).getNumCoursesTaught() == getNumCoursesTaught()){
									
									if(((Faculty) obj).isTenured() == isTenured()){
										
										return true;
									}
									
								}
								
								}
								
			}
			
		}
			
			return false;
					
	}
	
	@Override
	
	public String toString () {
		
		String tenured = "Is Tenured";
		
		if(isTenured() == false){
			
			tenured = "Not Tenured";
			
		}
		
		return String.format(super.toString() + " Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", 
				
				tenured, numCoursesTaught, getAllCoursesTaughtAsString());
		
	}
	
	public int compareTo(Faculty f) {
		
		super.compareTo(f);
		
		if(getNumCoursesTaught() > f.getNumCoursesTaught()){
			
			return 1;
			
		}
		
		if(getNumCoursesTaught() < f.getNumCoursesTaught()){
			
			return -1;
			
		}
		
		else {
			
			return 0;
			
		}
		
	}
	
}
