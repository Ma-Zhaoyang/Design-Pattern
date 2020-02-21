package BuilderModel;

public abstract class MealBuilder {
	public Meal meal = new Meal();
	//�����������ʼ��������Ϊ��ָ��
	
	public abstract void buildFood();

	public abstract void buildDrink();

	public Meal getMeal() {
		// TODO Auto-generated method stub
      return meal;
	}
}
