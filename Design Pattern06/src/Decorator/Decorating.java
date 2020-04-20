package Decorator;

public class Decorating implements IBirthdayCake{

	private IBirthdayCake birthdayCake;//接口引用**
	
	public Decorating(IBirthdayCake birthdayCake) {
		// TODO Auto-generated constructor stub
		this.birthdayCake = birthdayCake;
	}
	@Override
	public void Show() {
		// TODO Auto-generated method stub
		birthdayCake.Show();
	}

}
