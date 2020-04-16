package Adapter;

public class Adapter extends OldJuicer implements InewJuicer{

	public String newPort(MyFruit fruit1, MyFruit fruit2) {
		String str = onePort(fruit1);
		str += onePort(fruit2);
		return str;
	};
}
