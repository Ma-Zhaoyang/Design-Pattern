package Composite;

import java.util.ArrayList;

public class Plate extends MyElement{

	private ArrayList list = new ArrayList();
	
	public void add(MyElement element) {
		list.add(element);
	}
	
	public void delete(MyElement element) {
		list.remove(element);
	}
	
	//吃掉所有子单位（包括子单位的子单位--知道没有子单位）
	@Override
	public void eat() {
		for(Object object:list) {
			((MyElement)object).eat();
		}
	}
}
