package abstraction;

public class Encapsulation {
	
	private String username,password;
	
	public void setUserName(String username){
		this.username=username;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getUserName(){
		return username;
	}
	
	public String getPassword(){
		return password;
	}

}
