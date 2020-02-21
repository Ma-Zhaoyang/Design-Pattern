package BuilderModel;

public class MealBuilderA extends MealBuilder {
    //public Meal meal;
    
	@Override
	public void buildFood() {
		meal.setFood("chicken");
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		meal.setDrink("juice");
	}

//	@Override
//	public Meal getMeal() {
//		// TODO Auto-generated method stub
//		return super.getMeal();
//	}

}
