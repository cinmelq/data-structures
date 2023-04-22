package arrays;

public class SequenciaDeFibonacci {
	public static void main(String[] args) {

		final int[] FIBONACCI = new int[20]; // declara e cria um array com 20 posições.
		// ignora a posição 0 pois na sequencia de fibonacci não existe 0.
		FIBONACCI[1] = 1;
		FIBONACCI[2] = 2;

		SequenciaDeFibonacci fibonacci = new SequenciaDeFibonacci();
		fibonacci.populateFibonacci(FIBONACCI, 3);

		fibonacci.printArray(FIBONACCI, 1);
	}

	void populateFibonacci(int[] array, int count) {
		if (count < array.length) {
			array[count] = array[count - 1] + array[count - 2];
			count++;
			populateFibonacci(array, count);
		}
	}

	void printArray(int[] array, int count) {
		if (count < array.length) {
			System.out.println(array[count]);
			count++;
			printArray(array, count);
		}
	}
}