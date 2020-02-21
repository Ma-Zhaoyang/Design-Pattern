package Combination;

public class AConFV implements AFruitAndVegetables{
    Meal meal = new Meal();
    
    public AConFV() {
		// TODO Auto-generated constructor stub
	   meal.setFruit(CreatF());
	   meal.setVegetables(CreatV());
    }
	@Override
	public Fruit CreatF() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public Vegetables CreatV() {
		// TODO Auto-generated method stub
		return new Tomato();
	}

}
