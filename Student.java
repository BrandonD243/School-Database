public class Student extends Person{
	
	private static int numStudents;
	
	private int studentID;
	
	private Course [] coursesTaken;
	
	private int numCoursesTaken;
	
	private boolean isGraduate;
	
	private String major = "undeclared";
	
	
	public Student() {
		
		numStudents += 1;
		
		coursesTaken = new Course [50];
		
		numCoursesTaken = 0;
		
		isGraduate = false;
		
		studentID = numStudents;
		
	}
	
	public Student(boolean isGraduate) {
		
		numStudents += 1;
		
		coursesTaken = new Course [50];
		
		numCoursesTaken = 0;
		
		this.isGraduate = isGraduate;
		
		studentID = numStudents;
		
	}
	
	public Student(String major, boolean isGraduate) {
		
		numStudents += 1;
		
		coursesTaken = new Course [50];
		
		numCoursesTaken = 0;
		
		this.major = major;
		
		this.isGraduate = isGraduate;
		
		studentID = numStudents;
		
	}
	
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		
		super(name, birthYear);
		
		numStudents += 1;
		
		coursesTaken = new Course [50];
		
		numCoursesTaken = 0;
		
		this.major = major;
		
		this.isGraduate = isGraduate;
		
		studentID = numStudents;
		
	}
	
	public boolean isGraduate() {
		
		return isGraduate;
		
	}
	
	public int getNumCoursesTaken() {
		
		return numCoursesTaken;
		
	}
	
	public static int getNumStudents() {
		
		return numStudents;
		
	}
	
	public int getStudentID() {
		
		return studentID;
		
	}
	
	public String getMajor() {
		
		return major;
		
	}
	
	public void setIsGraduate(boolean isGraduate) {
		
		this.isGraduate = isGraduate;
		
	}
	
	public void setMajor(String major) {
		
		this.major = major;
		
	}
	
	public void addCourseTaken(Course course) {
		
		if(numCoursesTaken < 50) {
		
		coursesTaken[numCoursesTaken++] = course;
		
		}
		
	}
	
	public void addCoursesTaken(Course[] course) {
		
		if(numCoursesTaken < 50) {

		for(int i = numCoursesTaken; i < course.length && numCoursesTaken < 50; i++) {
			
			addCourseTaken(course[i]);
		
	}
		
		}
		
	}
	
	public Course getCourseTaken(int index) {
		
		if(index < 0 || index >= coursesTaken.length) {
			
			return null;
			
		}
		
		return coursesTaken[index];
		
	}
	
	public String getCourseTakenAsString(int index) {
		
		if(index < 0 || index >= coursesTaken.length) {
			
			return "";
			
		}
		
		return coursesTaken[index].getCourseDept() + "-" + coursesTaken[index].getCourseNum();
		
	}
	
	public String getAllCoursesTakenAsString() {
		
		String allCourses = "";
		
		if(coursesTaken != null) {
			
			for(int i = 0; i < numCoursesTaken; i++) {
				
				if(i == numCoursesTaken - 1) {
					
					allCourses += getCourseTakenAsString(i);
					
				}
				
				else {
				
				allCourses += getCourseTakenAsString(i) + ", ";
				
				}
			
		}
			
		}
		
		return allCourses;
				
	}
	
	@Override
	
	public boolean equals(Object obj) {
		
		if(obj == null) {
			
			return false;
			
		}
		
		if(obj instanceof Student) {
			
			if(super.equals(obj)){
			
			if(((Student) obj).getStudentID() == studentID) {
				
				if(((Student) obj).coursesTaken == coursesTaken) {
					
					if(((Student) obj).getNumCoursesTaken() == numCoursesTaken) {
						
						if(((Student) obj).isGraduate() == isGraduate) {
							
							if(((Student) obj).getMajor() == major) {
								
								return true;
								
							}
							
						}
					}
					
				}
			}
			
		}
	}
		
		return false;
	
}
	
	public String toString() {
		
		String graduateString = "Graduate";
		
		if(isGraduate() == false) {
			
			graduateString = "Undergraduate";
			
		}
		
		return String.format(super.toString() + " Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
				
				studentID, major, graduateString, numCoursesTaken, getAllCoursesTakenAsString()); 
		
	}
	
	public int compareTo(Student s) {
		
		if(getBirthYear() > s.getBirthYear()){
			
			return 1;
			
		}
		
		if(getBirthYear() < s.getBirthYear()){
			
			return -1;
			
		}
		
		else {
			
			return 0;
		}
	
	}
	
}