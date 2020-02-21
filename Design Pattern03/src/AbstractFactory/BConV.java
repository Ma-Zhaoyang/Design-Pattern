package AbstractFactory;

public class BConV implements BFruitAndVegetables{

	@Override
	public Fruit CreatF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vegetables CreatV() {
		// TODO Auto-generated method stub
		return new Cabbage();
	}

}
