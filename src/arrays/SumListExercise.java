package arrays;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SumListExercise {

	public static void main(String[] args) {
//		Um número inteiro é representado no formato de um array, onde cada dígito do respectivo número corresponde a uma posição do array. 
//		O array está ordenado de forma reversa
//		
//		exemplo:
//		[6,7,8,9,1]
//		este array é equivalente ao número 19876.
//		Assim sendo, dado dois números neste formato retorne a soma dos valores seguindo o mesmo formato de array.
//		
//		Exemplo:
//		[1,2,3]
//		[3,2,1]
//		o resultado deve ser:
//		[4,4,4]

		int firstNumbers = Integer.parseInt(JOptionPane.showInputDialog("Input some integer numbers"));
		int secondNumbers = Integer.parseInt(JOptionPane.showInputDialog("Input more some integer numbers"));
		System.out.print("Input first numbers: " + firstNumbers + "\nInput second numbers: " + secondNumbers);
		System.out.println();

		ArrayList<Integer> firstNumbersList = inversionAndConversionToList(firstNumbers);
		ArrayList<Integer> secondNumbersList = inversionAndConversionToList(secondNumbers);

		System.out.print(firstNumbersList);
		System.out.print("\n" + secondNumbersList);
		System.out.println();

		ArrayList<Integer> sumListOneAndListTwo = sumListElements(firstNumbersList, secondNumbersList);
		System.out.print(sumListOneAndListTwo);
	}

	public static ArrayList<Integer> inversionAndConversionToList(int input) {
		String conversionToString = String.valueOf(input);
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = conversionToString.length() - 1; i >= 0; i--) {
			char index = conversionToString.charAt(i);
			int indexCharConversionToInteger = Character.getNumericValue(index);
			list.add(indexCharConversionToInteger);
		}

		return list;
	}

	public static ArrayList<Integer> sumListElements(ArrayList<Integer> firstList, ArrayList<Integer> secondList) {
		ArrayList<Integer> sum = new ArrayList<>();
		int auxiliarSumWithTwoPlaces = 0;
		if (firstList.size() == secondList.size()) {
			for (int i = 0, j = 0; i < firstList.size(); i++) {

				if (firstList.get(i) + secondList.get(j) >= 10) {
					int sumFirstAndSecond = firstList.get(i) + secondList.get(j);
					String conversionToString = String.valueOf(sumFirstAndSecond);

					char index1 = conversionToString.charAt(1);
					int indexCharConversionToInteger1 = Character.getNumericValue(index1);
					sum.add(auxiliarSumWithTwoPlaces + indexCharConversionToInteger1);

					char index0 = conversionToString.charAt(0);
					int indexCharConversionToInteger0 = Character.getNumericValue(index0);
					auxiliarSumWithTwoPlaces = indexCharConversionToInteger0;

				} else {
					sum.add(firstList.get(i) + secondList.get(j) + auxiliarSumWithTwoPlaces);
					auxiliarSumWithTwoPlaces = 0;
				}
				j++;
			}
		}
		if (auxiliarSumWithTwoPlaces != 0) {
			sum.add(auxiliarSumWithTwoPlaces);
			return sum;
		} else {
			return sum;
		}
	}
}
