package BuilderModel;

public abstract class MealBuilder {
	public Meal meal = new Meal();
	//必须在这里初始化，否则为空指针
	
	public abstract void buildFood();

	public abstract void buildDrink();

	public Meal getMeal() {
		// TODO Auto-generated method stub
      return meal;
	}
}
