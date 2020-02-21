package Combination;

public class ClientClass {
	public static void main(String[] args) {
       AConF factory01 = new AConF();
       //只需知道动态的工厂名，己可以完成操作，例：吃A厂的水果
       //很好扩展不同的工厂
       //但是增加工厂里的生产线就很麻烦，违反“开闭原则”
       Fruit fruit = factory01.CreatF();
       fruit.eat();
       
       AConFV factory02 = new AConFV();
       //在一个新的蔬菜、水果工厂内进行组合，实现建造者（服务员）的功能
       Meal meal = factory02.meal;
       System.out.println("套餐为：");
       System.out.println(meal.getFruit());
       System.out.println(meal.getVegetables());
	}
}
