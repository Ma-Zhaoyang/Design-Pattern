package Combination;

public class ClientClass {
	public static void main(String[] args) {
       AConF factory01 = new AConF();
       //ֻ��֪����̬�Ĺ���������������ɲ�����������A����ˮ��
       //�ܺ���չ��ͬ�Ĺ���
       //�������ӹ�����������߾ͺ��鷳��Υ��������ԭ��
       Fruit fruit = factory01.CreatF();
       fruit.eat();
       
       AConFV factory02 = new AConFV();
       //��һ���µ��߲ˡ�ˮ�������ڽ�����ϣ�ʵ�ֽ����ߣ�����Ա���Ĺ���
       Meal meal = factory02.meal;
       System.out.println("�ײ�Ϊ��");
       System.out.println(meal.getFruit());
       System.out.println(meal.getVegetables());
	}
}
