package Decorator;

public class Cake implements IBirthdayCake{
	
	//������
	public Cake() {
		// TODO Auto-generated constructor stub
		System.out.println("Original Cake is created");
	}

	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("Cake Blank");
	}
	
}
