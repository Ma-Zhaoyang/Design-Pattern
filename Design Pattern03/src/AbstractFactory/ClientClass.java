package AbstractFactory;

public class ClientClass {
	public static void main(String[] args) {
       AConF factory = new AConF();
       //只需知道动态的工厂名，己可以完成操作，例：吃A厂的水果
       //很好扩展不同的工厂
       //但是增加工厂里的生产线就很麻烦，违反“开闭原则”
       Fruit fruit = factory.CreatF();
       fruit.eat();
	}
}
