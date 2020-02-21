package Combination;

public class Meal {
	private Fruit fruit;
	private Vegetables vegetables;

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	public void setVegetables(Vegetables vegetables) {
		this.vegetables = vegetables;
	}
	
	public String getFruit() {
		return fruit.name;
	}
	
	public String getVegetables() {
		return vegetables.name;
	}
}
