package Adapter;

public class Client {

	public static void main(String[] args) {
		InewJuicer newJuicer = new Adapter();
		MyFruit fruit01 = new MyFruit("����");
		MyFruit fruit02 = new MyFruit("����");
		System.out.println(newJuicer.newPort(fruit01, fruit02));
		
	}
}
