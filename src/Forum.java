

public class Forum {

	
	private String name;
	private boolean loginRequired;
	private User user; //list
	
	
	public void registerUser(String username, String password) {
		user.setUsername(username);
		user.setPassword(password);
	}
	
	public User removeUser(User userToRemove) {
		return userToRemove;
	}
	
	
	public void createNewThread(String title, Post initialPost) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLoginRequired() {
		return loginRequired;
	}

	public void setLoginRequired(boolean loginRequired) {
		this.loginRequired = loginRequired;
	}
	
}
