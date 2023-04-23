package arrays;

import javax.swing.JOptionPane;

public class SumArrayExercise {
//	Um número inteiro é representado no formato de um array, onde cada dígito do respectivo número corresponde a uma posição do array. 
//	O array está ordenado de forma reversa
//	
//	exemplo:
//	[6,7,8,9,1]
//	este array é equivalente ao número 19876.
//	Assim sendo, dado dois números neste formato retorne a soma dos valores seguindo o mesmo formato de array.
//	
//	Exemplo:
//	[1,2,3]
//	[3,2,1]
//	o resultado deve ser:
//	[4,4,4]

	public static void main(String[] args) {

		int firstInput = Integer.parseInt(JOptionPane.showInputDialog("Input some numbers"));
		int secondInput = Integer.parseInt(JOptionPane.showInputDialog("Input more some numbers"));
		
		SumArrayExercise splitter = new SumArrayExercise();
		int[] firstArray = splitter.splitNumberToArray(firstInput);
		int[] secontArray = splitter.splitNumberToArray(secondInput);
		
		printArray(firstArray, 0);
		System.out.println();
		printArray(secontArray, 0);
	}

	int[] splitNumberToArray(int input) {
		int lengthArray = arrayLength(input);
		int[] array = new int[lengthArray];
		addIntegerNumbersInArray(input, array);
		return array;
	}

	private int arrayLength(int input) {
		int countQuantityNumbers = 0;
		if (input == 0) {
			countQuantityNumbers = 1;
		} else {
			while (input != 0) {
				countQuantityNumbers = countQuantityNumbers + 1;
				input = input / 10;
			}
		}
		return countQuantityNumbers;
	}

	private void addIntegerNumbersInArray(int input, int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			int lastNumber = input % 10;
			input = input / 10;
			array[i] = lastNumber;
		}
	}

	static void printArray(int[] array, int count) {
		if (count < array.length) {
			System.out.print(array[count]);
			count++;
			printArray(array, count);
		}
	}

}
