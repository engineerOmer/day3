package day3;

public class InstructorUser extends User{
	private String coursesGiven;
	private String yearOfExperience;
	
	
	public InstructorUser() {
		
	}
	public InstructorUser(int id, String firstName, String lastName, String email, String userName, String password,
			 String lessons, String status, String coursesGiven,String yearOfExperience) {
		super(id, firstName, lastName, email, userName, password, lessons, status);
		this.coursesGiven = coursesGiven;
		this.setYearOfExperience(yearOfExperience);
	}


	
	public String getCoursesGiven() {
		return coursesGiven;
	}
	public void setCoursesGiven(String coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
	public String getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(String yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

}
