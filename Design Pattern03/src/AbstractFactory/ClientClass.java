package AbstractFactory;

public class ClientClass {
	public static void main(String[] args) {
       AConF factory = new AConF();
       //ֻ��֪����̬�Ĺ���������������ɲ�����������A����ˮ��
       //�ܺ���չ��ͬ�Ĺ���
       //�������ӹ�����������߾ͺ��鷳��Υ��������ԭ��
       Fruit fruit = factory.CreatF();
       fruit.eat();
	}
}
