package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementsExercisesMethods {

	public static int[] removeElement(int[] array, int position) {

		int arrayLength = array.length - 1;

		int[] newArray = new int[arrayLength];

		for (int i = 0, j = 0; i < array.length; i++) {
			if (i != position) {
				newArray[j++] = array[i];
			}
		}

		array = newArray;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}

		return array;
	}
	
	public static int[] removeAllDuplicatesElements(int[] array) {
		Arrays.sort(array);
		
		if(array.length <= 1) {
			return array;
		}
		
		int[] temporaryArray = new int[array.length];
		int count = 0;
		
		for(int i = 0; i < array.length - 1; i++) {
				if(array[i] != array[i+1]) {
					temporaryArray[count++] = array[i];
			}
		}
			
			temporaryArray[count++] = array[array.length-1];
			
			int[] unique = new int[count];
			
			for(int i = 0; i < unique.length; i++) {
				System.out.print(temporaryArray[i] + ", ");
				unique[i] = temporaryArray[i];
			}
			
			array = unique;

		return array;

	}

	public static List<Integer> removeElementList(List<Integer> list, int position) {

		List<Integer> newList = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (i != position) {
				newList.add(list.get(i));
			}
		}

		list = newList;
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		return list;
	}
}