import java.io.*;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import java.io.FileInputStream;
import java.io.IOException;

public class Driver_SchoolDB {
	
	public static void main (String[] args) {
		
	FileInputStream print = null;
	
	Scanner keyboard = null;
	
	try {
		
		print = new FileInputStream("SchoolDB_Initial.txt");
		
		keyboard = new Scanner(print);
		
		while(keyboard.hasNextLine()) {
			
			System.out.println(keyboard.nextLine());
			
		}
		
	} catch (Exception e) {
		
		System.out.print(e);
		
	}
	
	System.out.println();
	
	System.out.println("**************************************************************");
	
	System.out.println("SCHOOL DATABASE INFO:");
	
	System.out.println();
	
	System.out.println("************************************************");
	
	System.out.println("COURSES:");
	
	Course c1 = new Course(true, 771, "MAT", 4);
	
	Course c2 = new Course(true, 777, "CMP", 4);
	
	Course c3 = new Course(true, 711, "CMP", 4);
	
	Course c4 = new Course(true, 723, "MAT", 4);
	
	Course c5 = new Course(false, 168, "CMP", 4);
	
	Course c6 = new Course(false, 338, "CMP", 4);
	
	System.out.println(c1);
	
	System.out.println(c2);
	
	System.out.println(c3);

	System.out.println(c4);

	System.out.println(c5);
	
	System.out.println(c6);

	System.out.println("************************************************");
	
	System.out.println("************************************************");

	System.out.println("PERSONS:");
	
	System.out.println("************************************************");
	
	System.out.println("************************************************");

	System.out.println("EMPLOYEES:");
	
	System.out.println("************************************************");
	
	System.out.println("************************************************");
	
	System.out.println("GENERAL STAFF:");
	
	Faculty f1 = new Faculty();
	
	Faculty f2 = new Faculty(true);
	
	Faculty f3 = new Faculty("MAT", false);
	
	Faculty f4 = new Faculty("Superman", 1938, "PHY", true);
	
	GeneralStaff gs1 = new GeneralStaff();
	
	GeneralStaff gs2 = new GeneralStaff("advise students");
	
	GeneralStaff gs3 = new GeneralStaff("Sanitation", "clean");
	
	GeneralStaff gs4 = new GeneralStaff("Flash Gordon", 1934, "Security", "safety");
	
	System.out.println(gs1);

	System.out.println(gs2);

	System.out.println(gs3);

	System.out.println(gs4);
	
	System.out.println("************************************************");
	
	System.out.println("************************************************");
	
	System.out.println("FACULTY:");
	
	System.out.println(f1);
	
	System.out.println(f2);
	
	System.out.println(f3);
	
	System.out.println(f4);
	
	System.out.println("************************************************");

	System.out.println("************************************************");

	System.out.println("STUDENTS:");
	
	Student s1 = new Student();
	
	Student s2 = new Student(false);
	
	Student s3 = new Student("Math", false);
	
	Student s4 = new Student("Wonderwoman", 1941, "JST", true);
	
	System.out.println(s1);
	
	System.out.println(s2);
	
	System.out.println(s3);
	
	System.out.println(s4);
	
	System.out.println("************************************************");
	
	System.out.println("**************************************************************");

	System.out.println();
	
}
	
}