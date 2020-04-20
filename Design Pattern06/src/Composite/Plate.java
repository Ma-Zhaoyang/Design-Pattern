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
	
	//�Ե������ӵ�λ�������ӵ�λ���ӵ�λ--֪��û���ӵ�λ��
	@Override
	public void eat() {
		for(Object object:list) {
			((MyElement)object).eat();
		}
	}
}