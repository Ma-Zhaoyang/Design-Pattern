package SimpleFactory;

public class ClientClass {
	public static void main(String[] args) {
       //多个游戏角色
		Factory factory = new SFactory();//在此处只要更改不同的工厂，生产不一样的角色
		//再結合反射class.forname可以实现完全不更改内部代码而实现效果
		//而且完全符合开闭原则
		Character character = factory.CreateCharacter();
		character.build();
	}
	
}
