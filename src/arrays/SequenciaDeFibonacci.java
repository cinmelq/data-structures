package arrays;

public class SequenciaDeFibonacci {
	public static void main(String[] args) {

		final int[] FIBONACCI = new int[20]; // declara e cria um array com 20 posições.
		//ignora a posição 0 pois na sequencia de fibonacci não existe 0.
		FIBONACCI[1] = 1;
		FIBONACCI[2] = 2;

		for (int i = 3; i < 20; i++) {
			FIBONACCI[i] = FIBONACCI[i - 1] + FIBONACCI[i - 2];
		}
		for (int i = 1; i < FIBONACCI.length; i++) {
			System.out.println(FIBONACCI[i]);
		}
	}

}