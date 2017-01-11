package school;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private  String name = "";
	private int marks = 0;
	private static List<Student> listOfStudents = new ArrayList<Student>();
	 void results(){
		System.out.println("Student name is " + name);
		if(marks>=40){
		System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
	}
	
	 public int getMarks(String name){
			Student student = new Student();
			student.loadData();
			
			for (Student student2 : listOfStudents) {
				
				if(student2.name.contains(name)){
					return student2.marks;
				}
			}
			
			return -1;
		}
	 public Student(){
		 
	 }
	 public  Student(String studentName , int studentMarks){
		 name = studentName;
		 marks = studentMarks;
	}
	
	
	public static void main(String[] args) {
		Student st1 = new Student("Bharath",45);
		st1.results();
		
		Student st2 = new Student();
		
		st2.name = "Kumar";
		st2.marks = 33;
		st2.results();
	}
	
	
	private void loadData(){
		Student st1 = new Student("Bharath", 33);
		Student st2 = new Student("Kumar", 44);
		Student st3 = new Student("Lalit", 100);
		Student st4 = new Student("Vali",23);
		listOfStudents.add(st1);
		listOfStudents.add(st2);
		listOfStudents.add(st3);
		listOfStudents.add(st4);
		
	}
}
