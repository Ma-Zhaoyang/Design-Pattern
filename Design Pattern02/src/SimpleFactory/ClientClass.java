package SimpleFactory;

public class ClientClass {
	public static void main(String[] args) {
       //�����Ϸ��ɫ
		Factory factory = new SFactory();//�ڴ˴�ֻҪ���Ĳ�ͬ�Ĺ�����������һ���Ľ�ɫ
		//�ٽY�Ϸ���class.forname����ʵ����ȫ�������ڲ������ʵ��Ч��
		//������ȫ���Ͽ���ԭ��
		Character character = factory.CreateCharacter();
		character.build();
	}
	
}
