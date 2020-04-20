package Facade;

public class Light {

	public String position;
	
	public Light(String position) {
		// TODO Auto-generated constructor stub
		this.position = position;
	}
	
	public void on() {
		// TODO Auto-generated method stub
		System.out.println(this.position + "´ò¿ª");
	}
	
	public void off() {
		// TODO Auto-generated method stub
		System.out.println(this.position + "¹Ø±Õ");
	}
}
