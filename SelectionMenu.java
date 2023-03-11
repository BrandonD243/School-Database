import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

import java.io.*;

public class SelectionMenu {
	
	public static void main (String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		List<Course> courses = new ArrayList<>();
		
		List<Faculty> faculties = new ArrayList<>();
		
		List<GeneralStaff> staff = new ArrayList<>();
		
		List<Student> students = new ArrayList<>();
		
		
		Course c = new Course(true, 771, "MAT", 4);
		
		Course c2 = new Course(true, 777, "CMP", 4);
		
		Course c3 = new Course(true, 711, "CMP", 4);
		
		Course c4 = new Course(true, 723, "MAT", 4);
		
		Course c5 = new Course(false, 168, "CMP", 4);
		
		Course c6 = new Course(false, 338, "CMP", 4);
		
		courses.add(c);
		
		courses.add(c2);
		
		courses.add(c3);
		
		courses.add(c4);
		
		courses.add(c5);
		
		courses.add(c6);
		
		Faculty newF = new Faculty();
		
		Faculty f2 = new Faculty(true);
		
		Faculty f3 = new Faculty("MAT", false);
		
		Faculty f4 = new Faculty("Superman", 1938, "PHY", true);
		
		faculties.add(newF);
		
		faculties.add(f2);

		faculties.add(f3);

		faculties.add(f4);
		
		GeneralStaff gs1 = new GeneralStaff();
		
		GeneralStaff gs2 = new GeneralStaff("advise students");
		
		GeneralStaff gs3 = new GeneralStaff("Sanitation", "clean");
		
		GeneralStaff gs4 = new GeneralStaff("Flash Gordon", 1934, "Security", "safety");
		
		staff.add(gs1);
		
		staff.add(gs2);
		
		staff.add(gs3);
		
		staff.add(gs4);

		int num = 0;
		
		while(num != 18) {
		
		System.out.println("*****************************************************");
		
		System.out.println("Enter a number to initiate an action.");
		
		System.out.println("*****************************************************");
		
		System.out.println("1: Create 3 new Courses.");
		
		System.out.println("2: Create 3 new Faculty members.");

		System.out.println("3: Create 3 new General Staff members.");
		
		System.out.println("4: Create 3 new Students.");

		System.out.println("5: Add 2 new Courses to a Faculty member.");
		
		System.out.println("6: Add 2 new Courses to a Student.");
		
		System.out.println("7: Add an array of 2 Courses to a Faculty member.");
		
		System.out.println("8: Add an array of 2 Courses to a Student.");
		
		System.out.println("9: Get the Course at index from a Faculty member.");
		
		System.out.println("10: Get the Course at index from a Student.");
		
		System.out.println("11: Select a Faculty member and a Course to see if the Faculty member teaches the course.");
		
		System.out.println("12: Determine which Faculty member teaches the most and the least courses.");
		
		System.out.println("13: Determine which Course is the minimum of all Courses in the catalog.");

		System.out.println("14: Determine which Course is the maximum of all Courses in the catalog.");

		System.out.println("15: Determine which Student has the most and least credits.");
		
		System.out.println("16: Display all info.");
		
		System.out.println("17: Write all info to text file.");
		
		System.out.println("18: End program.");
		
		num = keyboard.nextInt();
		
		int selection = 0;
		
		switch(num) {
		
		case 1:
			
			String isGraduate= "";
			
			int courseNum = 0;
			
			String courseDept = "";
			
			int numCredits = 0;
			
			boolean isGraduateBoolean = false;
			
			Course c1;
			
			for(int i = 1; i <= 3; i++) {
			
			System.out.println("*****************************************************");
			
			System.out.println("(" + i + "/3): Enter 'g' if the course is a graduate course.");
			
			System.out.println("Enter 'u' if the course is an undergraduate course.");
			
			isGraduate = keyboard.next();
			
			isGraduateBoolean = false;
			
			if(isGraduate.equals("g")){
				
				isGraduateBoolean = true;
			}
			
			System.out.println("Enter the course number.");
			
			courseNum = keyboard.nextInt();
			
			System.out.println("Enter the course department.");

			courseDept = keyboard.next();
			
			System.out.println("Enter the number of credits.");

			numCredits = keyboard.nextInt();
			
			c1 = new Course(isGraduateBoolean, courseNum, courseDept, numCredits);
			
			courses.add(c1);
			
			}
			
			break;
			
		case 2:
			
			String isTenured = "";
			
			boolean isTenuredBoolean = false;
			
			String deptName = "";
			
			String name = "";
			
			int birthYear = 0;
			
			Faculty f;
			
			for(int i = 1; i <= 3; i++) {
			
			System.out.println("*****************************************************");
			
			System.out.println("Enter a number based on the attributes of the faculty members.");
			
			System.out.println("1: no attributes");
			
			System.out.println("2: is tenured/not tenured");
			
			System.out.println("3: deparmtent name, is tenured/not tenured");
			
			System.out.println("4: name, birth year, deparmtent name, is tenured/not tenured");
			
			selection = keyboard.nextInt();
			
			switch(selection) {
			
			case 1:
				
				System.out.println("*****************************************************");
					
					f = new Faculty();
					
					faculties.add(f);
					
					break;
				
			case 2: 
				
				System.out.println("*****************************************************");
					
					System.out.println("(" + i + "/3): Enter 't' if the faculty member is tenured.");
					
					System.out.println("Enter 'n' if the faculty member is not tenured.");
					
					isTenured = keyboard.next();
					
					isTenuredBoolean = false;
					
					if(isTenured.equals("t")) {
						
						isTenuredBoolean = true;
			
					}
					
					 f = new Faculty(isTenuredBoolean);
					
					faculties.add(f);
				
				break;
				
			case 3:
				
				System.out.println("*****************************************************");
					
					System.out.println("(" + i + "/3): Enter the department name.");
					
					deptName = keyboard.next();
					
					System.out.println("(" + i + "/3): Enter 't' if the faculty member is tenured.");
					
					System.out.println("Enter 'n' if the faculty member is not tenured.");
					
					isTenured = keyboard.next();
					
					isTenuredBoolean = false;
					
					if(isTenured.equals("t")) {
						
						isTenuredBoolean = true;

				}
					
					f = new Faculty(deptName, isTenuredBoolean);
					
					faculties.add(f);
				
				break;
				
			case 4: 
				
				System.out.println("*****************************************************");
					
					System.out.println("(" + i + "/3): Enter the name of the faculty member.");
					
					name = keyboard.nextLine();
					
					System.out.println("(" + i + "/3): Enter the birth year of the faculty member.");
					
					birthYear = keyboard.nextInt();
					
					System.out.println("(" + i + "/3): Enter the department name.");
					
					deptName = keyboard.next();
					
					System.out.println("(" + i + "/3): Enter 't' if the faculty member is tenured.");
					
					System.out.println("Enter 'n' if the faculty member is not tenured.");
					
					isTenured = keyboard.next();
					
					isTenuredBoolean = false;
					
					if(isTenured.equals("t")) {
						
						isTenuredBoolean = true;
						
					}
					
					Faculty f1 = new Faculty(name, birthYear, deptName, isTenuredBoolean);
					
					faculties.add(f1);
				
				break;
				
			}
			
			}

			break;
			
		case 3:
			
			for(int i = 1; i <= 3; i++) {
			
			System.out.println("*****************************************************");
			
			System.out.println("Enter a number based on the attributes of the General Staff members.");
			
			System.out.println("1: no attributes");
			
			System.out.println("2: duty");
			
			System.out.println("3: deparmtent name, duty");
			
			System.out.println("4: name, birth year, deparmtent name, duty");
			
			selection = keyboard.nextInt();
			
			String duty = "";
			
			GeneralStaff g;
			
			switch(selection) {
			
			case 1:
				
				System.out.println("*****************************************************");
					
					g = new GeneralStaff();
					
					staff.add(g);
					
					break;
				
			case 2: 
				
				System.out.println("*****************************************************");
					
					System.out.println("(" + i + "/3): Enter the duty of the staff member.");
					
					duty = keyboard.next();
					
					g = new GeneralStaff(duty);
					
					staff.add(g);
				
				break;
				
			case 3:
				
				System.out.println("*****************************************************");
					
					System.out.println("(" + i + "/3): Enter the department name.");
					
					deptName = keyboard.next();
					
					System.out.println("(" + i + "/3): Enter the duty of the staff member.");
					
					duty = keyboard.next();
					
					g = new GeneralStaff(deptName, duty);
					
					staff.add(g);
				
				break;
				
			case 4: 
				
				System.out.println("*****************************************************");
					
					System.out.println("(" + i + "/3): Enter the name of the staff member.");
					
					name = keyboard.next();
					
					System.out.println("(" + i + "/3): Enter the birth year of the staff member.");
					
					birthYear = keyboard.nextInt();
					
					System.out.println("(" + i + "/3): Enter the department name.");
					
					deptName = keyboard.next();
					
					System.out.println("(" + i + "/3): Enter the duty of the staff member.");
					
					duty = keyboard.next();
					
					g = new GeneralStaff(name, birthYear, deptName, duty);
					
					staff.add(g);
				
				break;
				
			}
			
			}
				
			break;
			
		case 4:
			
			for(int i = 1; i <= 3; i++) {
			
			System.out.println("*****************************************************");
			
			System.out.println("Enter a number based on the attributes of the students.");
			
			System.out.println("1: no attributes");
			
			System.out.println("2: is graduate / is not graduate");
			
			System.out.println("3: major, is graduate / is not graduate");
			
			System.out.println("4: name, birth year, major, is graduate / is not graduate");
			
			selection = keyboard.nextInt();
			
			String major = "";
			
			Student s;
			
		switch(selection) {
		
			case 1:
				
				System.out.println("*****************************************************");

				s = new Student ();
				
				students.add(s);
				
				break;
				
			case 2:
				
				System.out.println("*****************************************************");
				
				System.out.println("(" + i + "/3): Enter 'g' if the student is a graduate.");
				
				System.out.println("Enter 'u' if the course is an undergraduate.");

				isGraduate = keyboard.next();
				
				isGraduateBoolean = false;
				
				if(isGraduate.equals("g")){
					
					isGraduateBoolean = true;
					
				}
				
				s = new Student(isGraduateBoolean);
				
				students.add(s);
				
				break;
				
			case 3:
				
				System.out.println("*****************************************************");
					
					System.out.println("(" + i + "/3): Enter the major of the student.");
					
					major = keyboard.next();
					
					System.out.println("(" + i + "/3): Enter 'g' if the student is a graduate.");
					
					System.out.println("Enter 'u' if the course is an undergraduate.");

					isGraduate = keyboard.next();
					
					isGraduateBoolean = false;
					
					if(isGraduate.equals("g")){
						
						isGraduateBoolean = true;
						
					}
					
					s = new Student(major, isGraduateBoolean);
			
					students.add(s);
				
				break;
				
			case 4:
				
				System.out.println("*****************************************************");
					
					System.out.println("(" + i + "/3): Enter the name of the student.");
					
					name = keyboard.next();
					
					System.out.println("(" + i + "/3): Enter the birth year of the student.");
					
					birthYear = keyboard.nextInt();
					
					System.out.println("(" + i + "/3): Enter the major of the student.");
					
					major = keyboard.next();
					
					System.out.println("(" + i + "/3): Enter 'g' if the student is a graduate.");
					
					System.out.println("Enter 'u' if the course is an undergraduate.");

					isGraduate = keyboard.next();
					
					isGraduateBoolean = false;
					
					if(isGraduate.equals("g")){
						
						isGraduateBoolean = true;
						
					}
					
					s = new Student(name, birthYear, major, isGraduateBoolean);
			
					students.add(s);
				
				break;
				
				}
			
		}
			
		break;
		
		case 5:
			
			System.out.println("*****************************************************");
			
			System.out.println("Choose a faculty member at an index to add courses to.");
			
			int index = keyboard.nextInt();
			
			while(index < 0 || index >= faculties.size()) {
					
					System.out.println("Invalid index. Try again");
					
					index = keyboard.nextInt();
					
				}
			
			Faculty f1 = faculties.get(index);
			
			for(int i = 1; i <= 2; i++) {
				
			System.out.println("*****************************************************");
			
			System.out.println("(" + i + "/2): Enter 'g' if the course is a graduate course.");
			
			System.out.println("Enter 'u' if the course is an undergraduate course.");
			
			isGraduate = keyboard.next();
			
			isGraduateBoolean = false;
			
			if(isGraduate.equals("g")){
				
				isGraduateBoolean = true;
			}
			
			System.out.println("Enter the course number.");
			
			courseNum = keyboard.nextInt();
			
			System.out.println("Enter the course department.");

			courseDept = keyboard.next();
			
			System.out.println("Enter the number of credits.");

			numCredits = keyboard.nextInt();
			
			c1 = new Course(isGraduateBoolean, courseNum, courseDept, numCredits);
			
			f1.addCourseTaught(c1);
			
			}
			
			break;
			
		case 6: 
			
			System.out.println("*****************************************************");
			
			System.out.println("Choose a student at an index to add courses to.");
			
			index = keyboard.nextInt();
			
			while(index < 0 || index >= students.size()) {
					
					System.out.println("Invalid index. Try again");
					
					index = keyboard.nextInt();
					
				}
			
			Student s1 = students.get(index);
			
			for(int i = 1; i <= 2; i++) {
				
			System.out.println("*****************************************************");
			
			System.out.println("(" + i + "/2): Enter 'g' if the course is a graduate course.");
			
			System.out.println("Enter 'u' if the course is an undergraduate course.");
			
			isGraduate = keyboard.next();
			
			isGraduateBoolean = false;
			
			if(isGraduate.equals("g")){
				
				isGraduateBoolean = true;
			}
			
			System.out.println("Enter the course number.");
			
			courseNum = keyboard.nextInt();
			
			System.out.println("Enter the course department.");

			courseDept = keyboard.next();
			
			System.out.println("Enter the number of credits.");

			numCredits = keyboard.nextInt();
			
			c1 = new Course(isGraduateBoolean, courseNum, courseDept, numCredits);
			
			s1.addCourseTaken(c1);
			
			}
		
		break;	
		
		case 7:
			
			Course [] coursesArray = new Course[2];
			
			System.out.println("*****************************************************");
			
			System.out.println("Choose a faculty member at an index to add courses to.");
			
			index = keyboard.nextInt();
			
			while(index < 0 || index >= faculties.size()) {
					
					System.out.println("Invalid index. Try again");
					
					index = keyboard.nextInt();
					
				}
			
			f = faculties.get(index);
			
			for(int i = 1; i <= 2; i++) {
				
			System.out.println("*****************************************************");

			System.out.println("(" + i + "/2): Enter 'e' if you're adding an existing course.");
			
			System.out.println("Enter 'n' if you're adding a new course.");
		
			String isExisting = keyboard.next();

			boolean isExistingBoolean = false;
			
			if(isExisting.equals("n")) {
				
				isExistingBoolean = true;
				
			}
			
			if(isExistingBoolean) {
				
				System.out.println("*****************************************************");
				
				System.out.println("Enter the index of the course.");
				
				index = keyboard.nextInt();
				
				while(index < 0 || index >= courses.size()) {
					
					System.out.println("Invalid index. Try again");
					
					index = keyboard.nextInt();
					
				}
				
				coursesArray[i - 1] = courses.get(index);
				
			}
			
			else {
				
				System.out.println("*****************************************************");
				
				System.out.println("(" + i + "/2): Enter 'g' if the course is a graduate course.");
				
				System.out.println("Enter 'u' if the course is an undergraduate course.");
				
				isGraduate = keyboard.next();
				
				isGraduateBoolean = false;
				
				if(isGraduate.equals("g")){
					
					isGraduateBoolean = true;
				}
				
				System.out.println("Enter the course number.");
				
				courseNum = keyboard.nextInt();
				
				System.out.println("Enter the course department.");

				courseDept = keyboard.next();
				
				System.out.println("Enter the number of credits.");

				numCredits = keyboard.nextInt();
				
				coursesArray[i - 1] = new Course(isGraduateBoolean, courseNum, courseDept, numCredits);

			}
			
			f.addCoursesTaught(coursesArray);
			
			}
			
			break;
			
		case 8:
			
			coursesArray = new Course[2];
			
			System.out.println("*****************************************************");
			
			System.out.println("Choose a student at an index to add courses to.");
			
			index = keyboard.nextInt();
			
			while(index < 0 || index >= students.size()) {
					
					System.out.println("Invalid index. Try again");
					
					index = keyboard.nextInt();
					
				}
			
			s1 = students.get(index);
			
			for(int i = 1; i <= 2; i++) {
				
				System.out.println("*****************************************************");
				
				System.out.println("(" + i + "/2): Enter 'g' if the course is a graduate course.");
				
				System.out.println("Enter 'u' if the course is an undergraduate course.");
				
				isGraduate = keyboard.next();
				
				isGraduateBoolean = false;
				
				if(isGraduate.equals("g")){
					
					isGraduateBoolean = true;
				}
				
				System.out.println("Enter the course number.");
				
				courseNum = keyboard.nextInt();
				
				System.out.println("Enter the course department.");

				courseDept = keyboard.next();
				
				System.out.println("Enter the number of credits.");

				numCredits = keyboard.nextInt();
				
				c1 = new Course(isGraduateBoolean, courseNum, courseDept, numCredits);
				
				coursesArray[i - 1] = c1;
			
			}
			
			s1.addCoursesTaken(coursesArray);
			
			break;
			
		case 9:
			
			System.out.println("*****************************************************");
			
			System.out.println("Choose a faculty member at an index to get a course from.");
			
			index = keyboard.nextInt();
			
			while(index < 0 || index >= faculties.size()) {
					
					System.out.println("Invalid index. Try again");
					
					index = keyboard.nextInt();
					
				}
			
			f = faculties.get(index);
			
			System.out.println("Enter the index of the course.");
			
			index = keyboard.nextInt();
			
			while(index < 0 || index >= f.getNumCoursesTaught()) {
					
					System.out.println("Invalid index. Try again");
					
					index = keyboard.nextInt();
					
				}
			
			System.out.println(f.getCourseTaught(index));
			
			break;
			
		case 10:
			
			System.out.println("*****************************************************");
			
			System.out.println("Choose a student at an index to get a course from.");
			
			index = keyboard.nextInt();
			
			while(index < 0 || index >= students.size()) {
					
					System.out.println("Invalid index. Try again");
					
					index = keyboard.nextInt();
					
				}
			
			s1 = students.get(index);
			
			System.out.println("Enter the index of the course.");
			
			index = keyboard.nextInt();
			
			while(index < 0 || index >= s1.getNumCoursesTaken()) {
					
					System.out.println("Invalid index. Try again");
					
					index = keyboard.nextInt();
					
				}
			
			System.out.println(s1.getCourseTaken(index));
			
			break;
			
		case 11:
			
			System.out.println("*****************************************************");
			
			System.out.println("Enter the number based on the faculty member.");
			
			for(int i = 1; i <= faculties.size(); i++) {
				
				System.out.println(i + ": " + faculties.get(i - 1).toString());
				
			}
			
			selection = keyboard.nextInt();
			
			f = faculties.get(selection - 1);
			
			System.out.println("Enter the number based on the course.");
			
			for(int i = 1; i <= courses.size(); i++) {
				
				System.out.println(i + ": " + courses.get(i - 1).toString());
				
			}
			
			selection = keyboard.nextInt();
			
			c1 = courses.get(selection - 1);
			
			boolean found = false;
			
			for(int i = 0; i < f.getNumCoursesTaught(); i++) {
				
				if(f.getCourseTaught(i) == c1) {
					
					found = true;
					
				}
				
			}
				
				if(found == false) {
					
					System.out.println("The faculty member does not teach " + c1.getCourseName());
				
			}
				else if(found == true) {
					
					System.out.println("The faculty member teaches " + c1.getCourseName());
					
				}
			

			break;
			
		case 12:
			
			System.out.println("*****************************************************");
			
			int toBeat = faculties.get(0).getNumCoursesTaught();
			
			int indexCount = 0;
			
			for(int i = 0; i < faculties.size(); i++) {
				
				if(faculties.get(i).getNumCoursesTaught() > toBeat) {
					
					toBeat = faculties.get(i).getNumCoursesTaught();
					
					indexCount = i;
					
				}
				
				System.out.println(faculties.get(indexCount).getName() + " teaches the most courses.");
				
				toBeat = faculties.get(0).getNumCoursesTaught();
				
				indexCount = 0;
				
				for(i = 0; i < faculties.size(); i++) {
					
					if(faculties.get(i).getNumCoursesTaught() < toBeat) {
						
						toBeat = faculties.get(i).getNumCoursesTaught();
						
						indexCount = i;
						
					}
					
					System.out.println(faculties.get(indexCount).getName() + " teaches the least courses.");
				
				
			}
				
			}
			
			break;
			
		case 13:
			
			indexCount = 0;
			
			System.out.println("*****************************************************");
			
			toBeat = courses.get(0).getCourseNum();
			
			for(int i = 1; i < courses.size(); i++) {
				
				if(courses.get(i).getCourseNum() < toBeat) {
					
					toBeat = courses.get(i).getCourseNum();
					
					indexCount = i;
				}
				
			}
			
			System.out.println(courses.get(indexCount).getCourseName() + " is the minimum of all the courses.");

			
			break;
			
		case 14:
			
			indexCount = 0;
			
			System.out.println("*****************************************************");
			
			toBeat = courses.get(0).getCourseNum();
			
			for(int i = 1; i < courses.size(); i++) {
				
				if(courses.get(i).getCourseNum() > toBeat) {
					
					toBeat = courses.get(i).getCourseNum();
					
					indexCount = i;
				}
				
			}
			
			System.out.println(courses.get(indexCount).getCourseName() + " is the maximum of all the courses.");
			
			break;
			
		case 15:
			
			System.out.println("*****************************************************");
			
			toBeat = 0;
			
			for(int i = 0; i < students.get(0).getNumCoursesTaken(); i++) {
				
				toBeat += students.get(0).getCourseTaken(i).getNumCredits();
				
			}
			
			indexCount = 0;
			
			int challenger = 0;
			
			for(int i = 0; i < students.size(); i++) {
				
				for(int j = 0; i < students.get(i).getNumCoursesTaken(); j++) {
					
					challenger += students.get(i).getCourseTaken(i).getNumCredits();
					
				}
				
				if(challenger > toBeat) {
					
					toBeat = challenger;
					
					indexCount = i;
					
				}
				
				System.out.println(students.get(indexCount).getName() + " has the most credits.");
				
				for(i = 0; i < students.get(0).getNumCoursesTaken(); i++) {
					
					toBeat += students.get(0).getCourseTaken(i).getNumCredits();
					
				}
				
				indexCount = 0;
				
				challenger = 0;
				
				for(i = 0; i < students.size(); i++) {
					
					for(int j = 0; i < students.get(i).getNumCoursesTaken(); j++) {
						
						challenger += students.get(i).getCourseTaken(i).getNumCredits();
						
					}
					
					if(challenger < toBeat) {
						
						toBeat = challenger;
						
						indexCount = i;
						
					}
					
					System.out.println(students.get(indexCount).getName() + " has the least credits.");
				
			}
				
			}
			
			break;
			
		case 16:
			
			System.out.println("SCHOOL DATABASE INFO:");
			
			System.out.println("*****************************************************");
			
			System.out.println("COURSES:");
			
			for(int i = 0; i < courses.size(); i++) {
				
				System.out.println(courses.get(i));
				
			}
			
			System.out.println("*****************************************************");
			
			System.out.println("PEOPLE:");
			
			System.out.println("*****************************************************");
			
			System.out.println("EMPLOYEES:");
			
			System.out.println("*****************************************************");
			
			System.out.println("GENERAL STAFF:");
			
			for(int i = 0; i < staff.size(); i++) {
				
				System.out.println(staff.get(i));
				
			}
			
			System.out.println("*****************************************************");
			
			System.out.println("FACULTY:");
			
			for(int i = 0; i < faculties.size(); i++) {
				
				System.out.println(faculties.get(i));
				
			}
			
			System.out.println("*****************************************************");
			
			System.out.println("STUDENTS:");
			
			for(int i = 0; i < students.size(); i++) {
				
				System.out.println(students.get(i));
				
			}
			
			System.out.println("*****************************************************");
			
			break;
				
		case 17:
			
			System.out.println("*****************************************************");
			
			FileOutputStream output = null;
			
			PrintWriter writer = null;
			
			System.out.println("What is the name of your file?");
			
			String fileName = keyboard.next();
			
			try {
				
				output = new FileOutputStream(fileName + ".txt");
				
				writer = new PrintWriter(output);
				
				writer.println("SCHOOL DATABASE INFO:");
				
				writer.println("*****************************************************");
				
				writer.println("COURSES:");
				
				for(int i = 0; i < courses.size(); i++) {
					
					writer.println(courses.get(i));
					
				}
				
				writer.println("*****************************************************");
				
				writer.println("PEOPLE:");
				
				writer.println("*****************************************************");
				
				writer.println("EMPLOYEES:");
				
				writer.println("*****************************************************");
				
				writer.println("GENERAL STAFF:");
				
				for(int i = 0; i < staff.size(); i++) {
					
					writer.println(staff.get(i));
					
				}
				
				writer.println("*****************************************************");
				
				writer.println("FACULTY:");
				
				for(int i = 0; i < faculties.size(); i++) {
					
					writer.println(faculties.get(i));
					
				}
				
				writer.println("*****************************************************");
				
				writer.println("STUDENTS:");
				
				for(int i = 0; i < students.size(); i++) {
					
					writer.println(students.get(i));
					
				}
				
				System.out.println("*****************************************************");
				
				
			} catch(Exception IO) {
				
				System.out.println("File Not Found " + fileName);
				
			} finally { 
				
				writer.close();
				
			}
			
			break;
		
		case 18: 
			
			System.out.println("*****************************************************");

			System.out.println("Goodbye!");
			
			keyboard.close();
			
			break;
			
		}

}
	
}

} 