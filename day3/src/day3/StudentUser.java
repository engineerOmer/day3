package day3;

public class StudentUser extends User{
	private String joinOfCourse;

	public StudentUser() {
		
	}
	
	public StudentUser(int id, String firstName, String lastName, String email, String userName, String password,
			 String lessons, String status, String joinOfCourse) {
		super(id, firstName, lastName, email, userName, password, lessons, status);
		this.joinOfCourse = joinOfCourse;
	}


	public String getJoinOfCourse() {
		return joinOfCourse;
	}
	public void setJoinOfCourse(String joinOfCourse) {
		this.joinOfCourse = joinOfCourse;
	}
}
