package AbstractFactory;

public class BConF implements BFruitAndVegetables{

	@Override
	public Fruit CreatF() {
		// TODO Auto-generated method stub
		return new Banana();
	}

	@Override
	public Vegetables CreatV() {
		// TODO Auto-generated method stub
		return null;
	}

}
