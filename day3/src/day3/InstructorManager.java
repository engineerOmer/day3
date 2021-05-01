	package day3;

public class InstructorManager {
	public void addANewCourse(User user) {
		System.out.println("Yeni kursunuz basariyla yuklendi. " + "Mr."+ user.getLastName());
	}
	public void getNewHomeworkPublish(User user) {
		System.out.println("Yeni odevler yayinlandi. " +"Mr."+user.getLastName() );
	}
}
