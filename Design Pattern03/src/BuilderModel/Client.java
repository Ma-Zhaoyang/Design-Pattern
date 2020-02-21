package BuilderModel;

public class Client {
	public static void main(String[] args) {
      MealBuilder mb = new MealBuilderA();
      
      KFCWaiter waiter = new KFCWaiter();
      
      waiter.setMealBuilder(mb);
      
      Meal meal = new Meal();
      meal = waiter.construct();
      
      System.out.println("�ײ����Ϊ��");
      System.out.println(meal.getFood());
      System.out.println(meal.getDrink());
	}
}
