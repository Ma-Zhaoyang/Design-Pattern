package Adapter;

public class OldJuicer {
	public String onePort(MyFruit fruit) {
		String str = fruit.get() + "¹ûÖ­";
		return str;
	}
}
