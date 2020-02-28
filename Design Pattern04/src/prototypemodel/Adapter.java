package prototypemodel;

public class Adapter implements InewBanana{
    
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		Banana banana = new Banana();
		String eat = banana.eat();
		eat = eat + " " + eat;
		return eat;
	}
    
}
