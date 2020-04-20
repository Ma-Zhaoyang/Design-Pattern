package Decorator;

public class Fruit extends Decorating{

	public void PutFruit() {
		// TODO Auto-generated method stub
		System.out.println("Add Fruit ...");
	}
	
	public Fruit(IBirthdayCake birthdayCake) {
		// TODO Auto-generated constructor stub
		super(birthdayCake);
	}
}
