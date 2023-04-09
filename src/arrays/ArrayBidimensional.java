package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBidimensional {

	public static void main(String[] args) {
//		int[] arr1 = new int[10];
//		int[] arr2 = new int[10];
//
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				System.out.print(arr1[i] + arr2[j]);
//			}
//			System.out.println();
//		}

		// Método não muito apropriado,
		List<Integer> averageTempDay1 = new ArrayList<>();
		averageTempDay1.add(72);
		averageTempDay1.add(75);
		averageTempDay1.add(79);
		averageTempDay1.add(81);
		averageTempDay1.add(81);
		List<Integer> averageTempDay2 = new ArrayList<>();
		averageTempDay2.add(81);
		averageTempDay2.add(79);
		averageTempDay2.add(75);
		averageTempDay2.add(75);
		averageTempDay2.add(73);
		averageTempDay2.add(72);

		// Matriz(array bidimensional -> método apropriado
		// pode ser usado para armazenar as informações, na qual cada linha representará
		// o dia e cada coluna representará a medida da temperatura
		// de hora em hora
		ArrayList<ArrayList<Integer>> averageTemp = new ArrayList<>();
		ArrayList<Integer> averageTemp1 = new ArrayList<>(Arrays.asList(72, 75, 79, 79, 81, 81));
		ArrayList<Integer> averageTemp2 = new ArrayList<>(Arrays.asList(81, 79, 75, 75, 73, 73));

		averageTemp.addAll(Arrays.asList(averageTemp1, averageTemp2));
		printMatrix(averageTemp);
	}

	public static void printMatrix(ArrayList<ArrayList<Integer>> list) {
		for (int line = 0; line < list.size(); line++) {
			for (int column = 0; column < list.size(); column++) {
				System.out.print(list.get(line).get(column) + " ");
			}
			System.out.println();
		}
	}
}
