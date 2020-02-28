package prototypemodel;

public class ClientClass {
	public static void main(String[] args) {
       MyFruit fru1 = new Apple();
       MyFruit fru2 = (Apple)fru1.clone();
       //fru1.display();
       //fru2.display();
       //System.out.println(fru1==fru2);
       MyFruitStore.Add(1, fru1);
       MyFruitStore.Add(2, fru2);
       MyFruitStore.Add(3, new Apple());
       MyFruitStore.Add(4, new Banana());
       
       MyFruit fru = (MyFruit)MyFruitStore.Get(4);
       fru.display();
       
       InewBanana newBanana = new Adapter();
       System.out.println(newBanana.eat());
	}
}
