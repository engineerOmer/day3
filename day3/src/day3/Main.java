package day3;

public class Main {

	public static void main(String[] args) {
		StudentUser studentUser1= new StudentUser();
		studentUser1.setId(1);
		studentUser1.setFirstName("Omer Faruk");
		studentUser1.setLastName("Sahin");
		studentUser1.setUserName("Omer Faruk Sahin");
		studentUser1.setPassword("12345");
		studentUser1.setStatus("Student");
		studentUser1.setEmail("Omer@gmail.com");
		studentUser1.setLessons("Java + React");
		studentUser1.setJoinOfCourse("2");
		
		System.out.println(studentUser1.getFirstName());
		
		InstructorUser instructorUser1 = new InstructorUser();
		instructorUser1.setId(1);
		instructorUser1.setFirstName("Engin");
		instructorUser1.setLastName("Demirog");
		instructorUser1.setUserName("Engin Demirog");
		instructorUser1.setPassword("987654");
		instructorUser1.setStatus("Instructor");
		instructorUser1.setEmail("Engindemorig@gmail.com");
		instructorUser1.setCoursesGiven("Java + React"+" "+"C# + Angular");
		instructorUser1.setYearOfExperience("16");
		
		System.out.println(instructorUser1.getFirstName());

		UserManager userManager = new UserManager();
		
		userManager.logIn(instructorUser1);
		userManager.logOut(instructorUser1);
		
		UserManager userManager2 = new UserManager();
		
		userManager2.logIn(studentUser1);
		userManager2.logOut(studentUser1);
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.recordCourse(studentUser1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addANewCourse(instructorUser1);
		instructorManager.getNewHomeworkPublish(instructorUser1);
	}

}
