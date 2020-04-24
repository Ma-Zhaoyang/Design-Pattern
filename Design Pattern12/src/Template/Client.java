package Template;

public class Client {
	public static void main(String[] args) {
		ADefiniteInteral[] x = new ADefiniteInteral[2];
		x[0] = new DefIntegralXX(0, 20, 100);
		x[1] = new DefIntergralLn(2, 55, 110);
		for (int i = 0; i < 2; i++) {
			System.out.println(x[i].CalDefiniteIntegral());
		}
	}
}
