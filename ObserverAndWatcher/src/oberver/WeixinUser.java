package oberver;

public class WeixinUser implements Observer {
	
	private String name;
	public WeixinUser(String name){
		this.name = name;
	}

	public void updateM(String message) {
		// TODO Auto-generated method stub
		System.out.println(name+":   "+message);

	}

}
