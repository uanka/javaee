package history;

public class User {

	private String nickname;
	
	public User() {}
	
	public User(String nickname) {
		this.nickname = nickname;
	}
	
	public void logIn() {
		System.out.println("Hi! I'm logged in!");
	}
	
	public void logOut() {
		System.out.println("Bye!");
	}
	
//	public void doSomething() {
//		System.out.println("I'm doing something!");
//	}
	
	public void chating() {
		System.out.println("I'm chatting w/ my friend!");
	}
	
	public String getNickname() {
		return nickname;
	}
}
