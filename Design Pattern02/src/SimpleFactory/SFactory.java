package SimpleFactory;

public class SFactory extends Factory{
	public Character CreateCharacter() {
		 return new Solider();
		}
}
