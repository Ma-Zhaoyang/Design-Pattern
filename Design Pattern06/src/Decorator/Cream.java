package Decorator;

public class Cream extends Decorating{

	public void PutCream() {
		// TODO Auto-generated method stub
		System.out.println("Add Cream ...");
	}
	
	public Cream(IBirthdayCake birthdayCake) {
		// TODO Auto-generated constructor stub
		super(birthdayCake);
	}
}
