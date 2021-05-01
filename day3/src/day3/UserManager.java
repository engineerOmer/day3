package day3;



public class UserManager {
	public void logIn(User user) {
		System.out.println("Basarili bir sekilde giris yapildi :" + user.getUserName());
	}
	
	public void logOut(User user) {
		System.out.println(user.getUserName() + " " + "Basarili bir sekilde cikis yapildi");
	}
	
	
	
	

}
